package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.DangerQuery;
import com.beiken.saas.platform.biz.vo.DangerVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.manage.DangerManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

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

    @ApiOperation("隐患列表")
    @ResponseBody
    @PostMapping(value = "/list/{userId}")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "监理id/井队长id", required = true, dataType = "Long")})
    public Result list(@PathVariable Long userId, @RequestBody DangerQuery dangerQuery) {
        try {
            if (StringUtils.isBlank(dangerQuery.getSort())) {
                dangerQuery.setSort("ASC");
            }
            if (Objects.isNull(dangerQuery.getRoleType())) {
                return Result.error(Constants.ERROR, "角色参数错误");
            }
            PageBo<DangerVO> pageBo = dangerManager.listByUser(userId, dangerQuery);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("除了列表以外的都用这个接口")
    @ResponseBody
    @PostMapping(value = "/update/{dangerCode}")
    @ApiImplicitParams({@ApiImplicitParam(name = "dangerCode", value = "监理id", required = true, dataType = "Long")})
    public Result update(@PathVariable String dangerCode, @RequestBody DangerVO dangerVO) {
        try {
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }
}
