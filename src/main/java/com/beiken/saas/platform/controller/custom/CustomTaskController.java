package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.TaskItemVO;
import com.beiken.saas.platform.biz.vo.TaskVO;
import com.beiken.saas.platform.manage.TaskManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 下午4:07
 */
@Api(value = "/custom", description = "用户端相关接口", tags = "用户端接口")
@RestController
@RequestMapping("/custom/task")
@Slf4j
public class CustomTaskController {

    @Resource
    private TaskManager taskManager;

    @ApiOperation("获取单人任务列表")
    @ResponseBody
    @RequestMapping(value = "/list")
    public Result list(@RequestParam Long inspectUserId) {
        try {
            PageBo<TaskVO> pageBo = taskManager.listByUser(inspectUserId);
            return Result.success(pageBo);
        } catch (Exception e) {
            log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("获取任务检查项")
    @ResponseBody
    @RequestMapping(value = "/list/item")
    public Result listItem(@RequestParam String taskCode) {
        try {
            PageBo<TaskItemVO> pageBo = taskManager.listTaskItem(taskCode);
            return Result.success(pageBo);
        } catch (Exception e) {
            log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("合格/不合格")
    @ResponseBody
    @RequestMapping(value = "/update-status")
    public Result listItem(TaskItemVO taskItemVO) {
        try {
            taskManager.updateTaskItem(taskItemVO);
            return Result.success();
        } catch (Exception e) {
            log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }
}
