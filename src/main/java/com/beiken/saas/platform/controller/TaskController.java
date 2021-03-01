package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.TaskQuery;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.TaskVO;
import com.beiken.saas.platform.manage.TaskManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午5:33
 */
@Api(value = "/inspect/task", description = "检查任务相关接口", tags = "检查任务")
@RestController
@RequestMapping("/inspect/task")
public class TaskController {

    @Resource
    private TaskManager taskManager;

    @ApiOperation("任务列表")
    @ResponseBody
    @RequestMapping(value = "/list")
    public Result list(TaskQuery taskQuery) {
        try {
            PageBo<TaskVO> pageBo = taskManager.list(taskQuery);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }



    @ApiOperation("任务详情")
    @ResponseBody
    @RequestMapping(value = "/info")
    public Result info(@RequestParam String taskCode) {
        try {
            TaskVO info = taskManager.info(taskCode);
            return Result.success(info);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }




}
