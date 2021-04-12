package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.DangerQuery;
import com.beiken.saas.platform.biz.vo.DangerVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.manage.BgManager;
import com.beiken.saas.platform.manage.DangerManager;
import com.beiken.saas.platform.manage.EnvManager;
import com.beiken.saas.platform.mapper.EnvMapper;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.UserMapper;
import com.beiken.saas.platform.pojo.BgInspectItemDO;
import com.beiken.saas.platform.pojo.EnvDO;
import com.beiken.saas.platform.pojo.HiddenDangerDO;
import com.beiken.saas.platform.pojo.UserDO;
import com.beiken.saas.platform.utils.CodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午7:54
 */
@Api(value = "/custom/danger", description = "用户端隐患上报相关接口", tags = "隐患相关接口")
@RestController
@RequestMapping("/custom/danger")
public class CustomDangerController {

    @Resource
    private DangerManager dangerManager;
    @Resource
    private HiddenDangerMapper dangerMapper;
    @Resource
    private BgManager bgManager;
    @Resource
    private CodeUtil codeUtil;
    @Resource
    private UserMapper userMapper;
    @Resource
    private EnvManager envManager;

    @ApiOperation("隐患列表")
    @ResponseBody
    @PostMapping(value = "/list/{userId}")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "监理id/井队长id", required = true, dataType = "Long")})
    public Result list(@PathVariable Long userId, @RequestBody DangerQuery dangerQuery) {
        try {
            if (StringUtils.isBlank(dangerQuery.getSort())) {
                dangerQuery.setSort("ASC");
            }
            PageBo<DangerVO> pageBo = dangerManager.listByUser(userId, dangerQuery);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("隐患详情")
    @ResponseBody
    @GetMapping(value = "/info/{dangerId}")
    public Result info(@PathVariable Long dangerId) {
        try {
            DangerQuery query = new DangerQuery();
            query.setDangerId(dangerId);
            PageBo<DangerVO> pageBo = dangerManager.listByUser(null, query);
            if (CollectionUtils.isEmpty(pageBo.getItemList())) {
                return Result.error(Constants.ERROR, "未找到");
            }
            DangerVO dangerVO = pageBo.getItemList().get(0);
            return Result.success(dangerVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("除了列表以外的都用这个接口")
    @ResponseBody
    @PostMapping(value = "/update/{dangerId}")
    public Result update(@PathVariable Long dangerId, @RequestBody DangerVO dangerVO) {
        try {
            if (dangerVO.getDangerLevel() == null) {
                return Result.error(Constants.ERROR, "未传隐患级别");
            }
            HiddenDangerDO orgDanger = dangerMapper.selectByPrimaryKey(dangerId);
            HiddenDangerDO dangerDO = new HiddenDangerDO();
            BeanUtils.copyProperties(dangerVO, dangerDO);
            dangerDO.setId(dangerId);

            List<Integer> process = null;
            if (orgDanger.getIsInspect() != null && orgDanger.getIsInspect() == 1) {
                process = Constants.STATUS_MAP.get(0).get(dangerDO.getDangerLevel());
            } else {
                process = Constants.STATUS_MAP.get(orgDanger.getReportType()).get(dangerDO.getDangerLevel());
            }

            if (dangerDO.getConfirmUserId() != null) {
                dangerDO.setDangerLevel(dangerVO.getDangerLevel());
                dangerDO.setReportStatus(process.get(1));
            }
            if (dangerDO.getInspectStatus() != null) {
                dangerDO.setDangerLevel(dangerVO.getDangerLevel());
                if (dangerVO.getDangerLevel() < 3) {
                    dangerDO.setReportStatus(DangerStatusEnum.FINISH.getStatus());
                } else {
                    dangerDO.setReportStatus(DangerStatusEnum.WAIT_ENV_ACCEPT.getStatus());
                }
                EnvDO envDO = new EnvDO();
                BeanUtils.copyProperties(dangerVO, envDO);
                envDO.setDangerId(dangerId);
                envManager.addEnvDO(envDO);
            }
            if (dangerDO.getDisLevelUserId() != null) {
                if (orgDanger.getReportType() == 0 || (orgDanger.getIsInspect() != null && orgDanger.getIsInspect() == 1)) {
                    dangerDO.setReportStatus(process.get(1));
                } else {
                    dangerDO.setReportStatus(process.get(2));
                }
                dangerDO.setDangerLevel(dangerVO.getDangerLevel());
            }
            if (dangerDO.getChangeUserId()!= null) {
                dangerDO.setDangerLevel(dangerVO.getDangerLevel());
                dangerDO.setReportStatus(DangerStatusEnum.WAIT_CHANGE.getStatus());
            }

            if (dangerDO.getEnvUserId() != null) {
                if (dangerDO.getEnvStatus() == null) {
                    return Result.error(Constants.ERROR, "未设置隐患状态");
                }
                dangerDO.setDangerLevel(dangerVO.getDangerLevel());
                if (dangerDO.getEnvStatus() == 1) {
                    dangerDO.setReportStatus(DangerStatusEnum.FINISH.getStatus());
                } else {
                    dangerDO.setReportStatus(DangerStatusEnum.WAIT_CHANGE.getStatus());
                }
                EnvDO envDO = new EnvDO();
                BeanUtils.copyProperties(dangerVO, envDO);
                envDO.setDangerId(dangerId);
                envManager.addEnvDO(envDO);
            }
            if (dangerDO.getCloseUserId() != null) {
                dangerDO.setDangerLevel(dangerVO.getDangerLevel());
                dangerDO.setReportStatus(DangerStatusEnum.CLOSE.getStatus());
            }
            dangerMapper.updateByPrimaryKeySelective(dangerDO);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("主动上报")
    @ResponseBody
    @PostMapping(value = "/add")
    public Result add(@RequestBody DangerVO dangerVO) {
        try {
            if (dangerVO.getDeptId() == null) {
                return Result.error(Constants.ERROR, "请选择受检井队");
            }
            HiddenDangerDO dangerDO = new HiddenDangerDO();
            BeanUtils.copyProperties(dangerVO, dangerDO);
            List<Integer> process = Constants.STATUS_MAP.get(dangerDO.getReportType()).get(dangerDO.getDangerLevel());
            dangerDO.setReportStatus(process.get(0));
            String dangerCode = codeUtil.buildDangerCode(dangerVO.getDeptId());
            dangerDO.setDangerCode(dangerCode);
            dangerDO.setGmtCreate(new Date());
            dangerDO.setGmtModified(new Date());
            dangerDO.setReportTime(new Date());
            dangerDO.setIsInspect(0);
            Long userId = dangerVO.getFindUserId();
            UserDO userDO = userMapper.selectByPrimaryKey(userId);
            if (userDO.getRole().equals("监理")) {
                dangerDO.setIsInspect(1);
                process = Constants.STATUS_MAP.get(0).get(dangerDO.getDangerLevel());
                dangerDO.setReportStatus(process.get(0));
            }
            dangerMapper.insert(dangerDO);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("查询bgitemcode")
    @ResponseBody
    @GetMapping(value = "/bgItem/{bgItemCode}")
    public Result bgItem(@PathVariable String bgItemCode) {
        try {
            BgInspectItemDO itemDO = bgManager.getBgItemDOByItemCode(bgItemCode);
            return Result.success(itemDO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }


}
