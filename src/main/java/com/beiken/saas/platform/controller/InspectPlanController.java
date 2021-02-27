package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.PlanQuery;
import com.beiken.saas.platform.biz.vo.InspectPlanVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.manage.InspectPlanManager;
import com.beiken.saas.platform.pojo.InspectPlanDept;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:45
 */
@Api(value = "/plan", description = "检查计划相关接口", tags = "检查计划")
@RestController
@RequestMapping("/inspect/plan")
@Slf4j
public class InspectPlanController {

    @Resource
    private InspectPlanManager planManager;

    @ApiOperation("计划列表")
    @ResponseBody
    @RequestMapping(value = "/list")
    public Result list(PlanQuery planQuery) {
        try {
            PageBo<InspectPlanVO> pageBo = planManager.planList(planQuery);
            return Result.success(pageBo);
        } catch (Exception e) {
            log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("填写基本信息")
    @ResponseBody
    @RequestMapping(value = "/add/step1")
    public Result add(InspectPlanVO inspectPlanVO) {
        try {
            return planManager.add(inspectPlanVO);
        } catch (Exception e) {
            log.error("add error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("查看步骤信息")
    @ResponseBody
    @RequestMapping(value = "/info")
    public Result info(@RequestParam String inspectPlanCode) {
        try {
            return planManager.info(inspectPlanCode);
        } catch (Exception e) {
            log.error("get info error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("选择周期接口")
    @ResponseBody
    @RequestMapping(value = "/update")
    public Result update(InspectPlanVO inspectPlanVO) {
        try {
            return planManager.updateByPlanCode(inspectPlanVO);
        } catch (Exception e) {
            log.error("get info error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("添加受检单位接口")
    @ResponseBody
    @RequestMapping(value = "/add/dept")
    public Result addPlanDept(List<InspectPlanDept> inspectPlanDepts) {
        try {
            return planManager.addPlanDept(inspectPlanDepts);
        } catch (Exception e) {
            log.error("get info error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("添加受检单位接口")
    @ResponseBody
    @RequestMapping(value = "/delete")
    public Result delete(@RequestParam String inspectCode) {
        try {
            return planManager.delete(inspectCode);
        } catch (Exception e) {
            log.error("get info error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

}
