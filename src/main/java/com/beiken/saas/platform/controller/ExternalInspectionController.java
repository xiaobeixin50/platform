package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.ExternalInspectionVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.pojo.ExternalInspection;
import com.beiken.saas.platform.service.ExternalInspectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "/external", description = "外部检查相关接口", tags = "外部检查")
@RestController
@RequestMapping("external")
public class ExternalInspectionController {
    @Autowired
    private ExternalInspectionService externalInspectionService;

    @ApiOperation("获取外部检查详情")
    @GetMapping("queryById")
    public Result<ExternalInspection> queryExternalInspection(Long id) {
        ExternalInspection danger = externalInspectionService.queryById(id);
        return Result.success(danger);
    }

    @ApiOperation("获取外部检查列表")
    @GetMapping("list")
    public Result<List<ExternalInspection>> queryList(String name) {
        List<ExternalInspection> list =  externalInspectionService.queryExternalInspection(0);
        return Result.success(list);

    }
    @ApiOperation("提交外部检查")
    @GetMapping("insert")
    public Result<Integer> insertNewRecord(ExternalInspectionVO externalInspectionVO) {
        try{
            BeanCopier copier = BeanCopier.create(ExternalInspectionVO.class, ExternalInspection.class, false);
            ExternalInspection danger = new ExternalInspection();
            copier.copy(externalInspectionVO, danger, null);
            return Result.success(externalInspectionService.addExternalInspection(danger));
        }catch (Exception e){
            return Result.failed("提交外部检查错误", e.getMessage());
        }

    }
}
