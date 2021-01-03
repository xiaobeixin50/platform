package com.beiken.saas.platform.controller;


import com.alibaba.fastjson.JSONObject;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.entity.User;
import com.beiken.saas.platform.service.StatisticsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author xiaobeixin
 * @since 2020-11-21 23:50:21
 */
@Api(value = "/manager", description = "巡检任务相关接口", tags = "巡检任务")
@RestController
@RequestMapping("manager")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;


    @ApiOperation("统计单位对比")
    @GetMapping("departmentCompare")
    public Result<List<JSONObject>> departmentCompare(Long depId, Date startTime, Date endTime) {

        List<JSONObject> result = statisticsService.departmentCompare(depId, startTime, endTime);
        return Result.success(result);
    }

    @ApiOperation("安全隐患排名")
    @GetMapping("hiddenDangerRank")
    public Result<List<JSONObject>> hiddenDangerRank(Long depId, Date startTime, Date endTime) {

        List<JSONObject> result = statisticsService.hiddenDangerRank(depId, startTime, endTime);
        return Result.success(result);
    }

    @ApiOperation("按生产单位分类统计")
    @GetMapping("departmentStatics")
    public Result<List<JSONObject>> departmentStatics(Long depId) {

        List<JSONObject> result = statisticsService.departmentStatics(depId);
        return Result.success(result);
    }

    @ApiOperation("巡检任务统计, 包含分公司和井队的数据？")
    @GetMapping("taskStatics")
    public Result<List<JSONObject>> taskStatics(Long depId, Date staticsDate) {

        List<JSONObject> result = statisticsService.taskStatics(depId, staticsDate);
        return Result.success(result);
    }

    @ApiOperation("监理人员统计")
    @GetMapping("inspectorStatics")
    public Result<List<JSONObject>> inspectorStatics(Long depId) {

        List<JSONObject> result = statisticsService.inspectorStatics(depId);
        return Result.success(result);
    }

    @ApiOperation("单个监理人员统计，包括巡检任务和安全隐患")
    @GetMapping("singleInspectorStatics")
    public Result<JSONObject> singleInspectorStatics(Long depId, Long userId) {

        JSONObject result = statisticsService.singleInspectorStatics(depId, userId);
        return Result.success(result);
    }

    @ApiOperation("重点关注，包括待办事项和重大风险")
    @GetMapping("managerFocus")
    public Result<JSONObject> managerFocus(Long depId, Long userId) {

        JSONObject result = statisticsService.managerFocus(depId, userId);
        return Result.success(result);
    }



}
