package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.TaskItemVO;
import com.beiken.saas.platform.biz.vo.TaskVO;
import com.beiken.saas.platform.manage.TaskManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @ApiOperation("获取单人任务列表")
    @ResponseBody
    @GetMapping(value = "/list")
    @ApiImplicitParams({@ApiImplicitParam(name = "inspectUserId", value = "检查人id", required = true, dataType = "Long")})
    public Result list(@RequestParam Long inspectUserId) {
        try {
            PageBo<TaskVO> pageBo = taskManager.listByUser(inspectUserId);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }


    @ApiOperation("获取任务检查项")
    @ResponseBody
    @GetMapping(value = "/list/item")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskCode", value = "任务编码", required = true, dataType = "String")})
    public Result listItem(@RequestParam String taskCode) {
        try {
            PageBo<TaskItemVO> pageBo = taskManager.listTaskItem(taskCode);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("合格/不合格")
    @ResponseBody
    @GetMapping(value = "/update-status")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskItemVO", value = "任务项", required = true, dataType = "TaskItemVO", paramType = "TaskItemVO")})
    public Result update(TaskItemVO taskItemVO) {
        try {
            taskManager.updateTaskItem(taskItemVO);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }
}
