package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.HiddenDangerVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.StopCardVO;
import com.beiken.saas.platform.entity.InspectionStopcard;
import com.beiken.saas.platform.pojo.HiddenDanger;
import com.beiken.saas.platform.service.HiddenDangerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "/danger", description = "安全隐患相关接口", tags = "安全隐患")
@RestController
@RequestMapping("danger")
public class HiddenDangerController {

    @Autowired
    private HiddenDangerService hiddenDangerService;

    @ApiOperation("获取安全隐患详情")
    @GetMapping("queryById")
    public Result<HiddenDanger> queryHiddenDanger(Long id) {
        HiddenDanger danger = hiddenDangerService.queryById(id);
        return Result.success(danger);
    }

    @ApiOperation("获取安全隐患列表")
    @GetMapping("list")
    public Result<List<HiddenDanger>> queryDangerList(String name) {
        List<HiddenDanger> list =  hiddenDangerService.queryHiddenDanger(0);
        return Result.success(list);

    }
    @ApiOperation("提交安全隐患")
    @GetMapping("insert")
    public Result<Integer> insertDanger(HiddenDangerVO dangerVO) {
        try{
            BeanCopier copier = BeanCopier.create(HiddenDangerVO.class, HiddenDanger.class, false);
            HiddenDanger danger = new HiddenDanger();
            copier.copy(dangerVO, danger, null);
            return Result.success(hiddenDangerService.addHiddenDanger(danger));
        }catch (Exception e){
            return Result.failed("提交安全隐患错误", e.getMessage());
        }

    }
}
