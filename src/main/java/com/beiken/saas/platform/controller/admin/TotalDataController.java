package com.beiken.saas.platform.controller.admin;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.TotalDataVO;
import com.beiken.saas.platform.enums.Constants;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("概览第一块")
    @ResponseBody
    @GetMapping(value = "/first")
    @ApiImplicitParams({@ApiImplicitParam(name = "startTime", value = "开始时间", required = false)
                        ,@ApiImplicitParam(name = "endTime", value = "结束时间", required = false)})
    public Result first(Date startTime, Date endTime) {
        try {
            TotalDataVO totalDataVO = new TotalDataVO();
            totalDataVO.setDangerNum(10L);
            totalDataVO.setFinishDangerNum(20L);
            totalDataVO.setLimitTimeNum(50L);
            totalDataVO.setTaskNum(160L);
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
