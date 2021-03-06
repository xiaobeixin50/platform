package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.vo.*;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.manage.*;
import com.beiken.saas.platform.mapper.InspectDeptMapper;
import com.beiken.saas.platform.pojo.InspectTaskDO;
import com.beiken.saas.platform.pojo.InspectTaskItemDO;
import com.beiken.saas.platform.pojo.UserDO;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 下午4:07
 */
@Api(value = "/custom/task", description = "用户端巡检任务相关接口", tags = "巡检任务接口")
@RestController
@RequestMapping("/custom/task")
public class CustomTaskController {

    @Resource
    private TaskManager taskManager;
    @Resource
    private UserManager userManager;
    @Resource
    private InspectDeptManager inspectDeptManager;
    @Resource
    private RigManager rigManager;

    @ApiOperation("获取单人任务列表")
    @ResponseBody
    @GetMapping(value = "/list/{userId}/{rigCode}")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "检查人id", required = true, dataType = "Long")
            , @ApiImplicitParam(name = "rigCode", value = "井code", required = true, dataType = "String")
            , @ApiImplicitParam(name = "pageNo", value = "pageNo", required = false, dataType = "Integer")
            , @ApiImplicitParam(name = "pageSize", value = "pageSize", required = false, dataType = "Integer")})
    public Result list(@PathVariable Long userId, @PathVariable String rigCode,
                       @RequestParam(required = false) Integer pageNo, @RequestParam(required = false) Integer pageSize) {
        try {
            PageBo<TaskListVO> pageBo = taskManager.listByUser(userId, rigCode, pageNo, pageSize);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("获取单个任务状态")
    @ResponseBody
    @GetMapping(value = "/info/{taskCode}/{userId}/{rigCode}")
    public Result taskInfo(@PathVariable String taskCode, @PathVariable Long userId, @PathVariable String rigCode) {
        try {
            InspectTaskDO taskByTaskCode = taskManager.getTaskByTaskCode(taskCode, userId);
            List<TaskVO> taskVOList = taskManager.getTaskVOList(Lists.newArrayList(taskByTaskCode), rigCode);
            return Result.success(taskVOList.get(0));
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("获取当前用户所在的的井队/对应的子公司和对应的钻井号")
    @ResponseBody
    @GetMapping(value = "/rig/{userId}")
    public Result getDeptByUser(@PathVariable Long userId) {
        try {
            List<Long> deptIdList = Lists.newArrayList();
            UserDO userById = userManager.getUserById(userId);
            if (userById == null) {
                return Result.error(Constants.ERROR, "未找到该人");
            }
            //监理要查询自己所负责的井/井队
            if (Constants.INSPECT_USER.equals(userById.getRole())) {
                List<Long> deptByInsepctUser = inspectDeptManager.getDeptByInsepctUser(userId);
                deptIdList.addAll(deptByInsepctUser);
            } else {
                deptIdList.add(userById.getDepId());
            }
            List<String> rigCodes = rigManager.getRigByDeptIds(deptIdList);

            UserRigVO taskUserRig = taskManager.getTaskUserRig(userId, rigCodes);
            if (Objects.isNull(taskUserRig)) {
                return Result.error(Constants.ERROR, "未找到管理的井");
            }
            return Result.success(taskUserRig);

        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }


    @ApiOperation("获取任务检查项,即任务详情")
    @ResponseBody
    @GetMapping(value = "/list/item")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskCode", value = "任务编码", required = true, dataType = "String")})
    public Result listItem(@RequestParam String taskCode, @RequestParam String rigCode) {
        try {
            PageBo<TaskItemListVO> voPageBo = taskManager.listTaskItem(taskCode, rigCode);
            return Result.success(voPageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("合格/不合格详情")
    @ResponseBody
    @GetMapping(value = "/item/info")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskCode", value = "任务编码", required = true, dataType = "String")
            , @ApiImplicitParam(name = "bgCode", value = "检查项code", required = true, dataType = "String")})
    public Result itemInfo(@RequestParam String taskCode, @RequestParam String bgCode, @RequestParam String rigCode) {
        try {
            TaskItemListVO.Extra info = taskManager.info(taskCode, bgCode, rigCode, Constants.ZERO_INT);
            if (Objects.isNull(info)) {
                return Result.error(Constants.ERROR, "未找到对应的检查项");
            }
            return Result.success(info);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("合格/不合格/不涉及")
    @ResponseBody
    @PostMapping(value = "/update-status")
    public Result update(@RequestBody TaskItemVO taskItemVO) {
        try {
            if (StringUtils.isBlank(taskItemVO.getTaskCode())
                    || StringUtils.isBlank(taskItemVO.getBgItemCode())
                    || StringUtils.isBlank(taskItemVO.getRigCode())
                    || Objects.isNull(taskItemVO.getResultStatus())) {
                return Result.error(Constants.ERROR, "参数未传taskCode以及bgItemCode以及rigCode");
            }
            String result = taskManager.updateTaskItem(taskItemVO);
            if ("true".equals(result)) {
                return Result.success();
            }
            return Result.error(Constants.ERROR, result);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }
}
