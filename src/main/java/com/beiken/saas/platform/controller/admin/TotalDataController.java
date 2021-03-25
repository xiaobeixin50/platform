package com.beiken.saas.platform.controller.admin;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.TotalDataVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.enums.TaskStatusEnum;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import com.beiken.saas.platform.pojo.InspectTaskDOExample;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/3/20
 * Time: 下午4:51
 */
@Api(value = "/admin/total", description = "数据概览接口", tags = "数据概览接口")
@RestController
@RequestMapping("/admin/total")
public class TotalDataController {
    @Resource
    private HiddenDangerMapper dangerMapper;
    @Resource
    private InspectTaskMapper taskMapper;

    @ApiOperation("概览第一块")
    @ResponseBody
    @GetMapping(value = "/first")
    @ApiImplicitParams({@ApiImplicitParam(name = "startTime", value = "开始时间", required = false)
                        ,@ApiImplicitParam(name = "endTime", value = "结束时间", required = false)})
    public Result first(Date startTime, Date endTime) {
        try {
            TotalDataVO totalDataVO = new TotalDataVO();

            //
            HiddenDangerDOExample dangerDOExample = new HiddenDangerDOExample();
            HiddenDangerDOExample.Criteria criteria = dangerDOExample.createCriteria()
                    .andGmtCreateGreaterThanOrEqualTo(startTime)
                    .andGmtCreateLessThanOrEqualTo(endTime);
            long countAllDanger = dangerMapper.countByExample(dangerDOExample);
            criteria.andReportStatusIn(Lists.newArrayList(
                    DangerStatusEnum.FINISH.getStatus(), DangerStatusEnum.CLOSE.getStatus()));
            long countFinishDanger = dangerMapper.countByExample(dangerDOExample);

            //task
            InspectTaskDOExample taskDOExample = new InspectTaskDOExample();
            InspectTaskDOExample.Criteria criteria1 = taskDOExample.createCriteria()
                    .andStartTimeLessThanOrEqualTo(startTime)
                    .andEndTimeGreaterThanOrEqualTo(endTime);
            long countAllTask = taskMapper.countByExample(taskDOExample);
            criteria1.andStatusEqualTo(TaskStatusEnum.AFTER_TIME.getStatus());
            long countAfterTimeTask = taskMapper.countByExample(taskDOExample);

            totalDataVO.setTaskNum(countAllTask);
            totalDataVO.setLimitTimeNum(countAfterTimeTask);
            totalDataVO.setDangerNum(countAllDanger);
            totalDataVO.setFinishDangerNum(countFinishDanger);

            return Result.success(totalDataVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("概览第二块")
    @ResponseBody
    @GetMapping(value = "/second")
    @ApiImplicitParams({@ApiImplicitParam(name = "startTime", value = "开始时间", required = false)
            ,@ApiImplicitParam(name = "endTime", value = "结束时间", required = false)})
    public Result second(Date startTime, Date endTime) {
        try {
            TotalDataVO totalDataVO = new TotalDataVO();
            Map<String, Double> map = Maps.newHashMap();
            map.put("北疆油服", 12.5);
            map.put("南疆油服", 87.5);
            totalDataVO.setValueMap(map);
            return Result.success(totalDataVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("概览第三块")
    @ResponseBody
    @GetMapping(value = "/third")
    @ApiImplicitParams({@ApiImplicitParam(name = "startTime", value = "开始时间", required = false)
            ,@ApiImplicitParam(name = "endTime", value = "结束时间", required = false)})
    public Result third(Date startTime, Date endTime) {
        try {
            TotalDataVO totalDataVO = new TotalDataVO();
            Map<String, Double> map = Maps.newHashMap();
            map.put("一级隐患", 12.5);
            map.put("二级隐患", 87.5);
            totalDataVO.setValueMap(map);
            return Result.success(totalDataVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }
}
