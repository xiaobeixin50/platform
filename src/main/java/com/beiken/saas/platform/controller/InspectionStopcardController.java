package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.StopCardVO;
import com.beiken.saas.platform.entity.InspectionStopcard;
import com.beiken.saas.platform.service.InspectionStopcardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InspectionStopcard)表控制层
 *
 * @author xiaobeixin
 * @since 2020-11-22 13:12:12
 */
@Api(value = "/stopcard", description = "Stop卡相关接口", tags = "Stop卡")
@RestController
@RequestMapping("stopcard")
public class InspectionStopcardController {
    /**
     * 服务对象
     */
    @Resource
    private InspectionStopcardService inspectionStopcardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过Id获取stopcard信息")
    @GetMapping("selectOne")
    public Result<InspectionStopcard> selectOne(Integer id) {

        return Result.success(this.inspectionStopcardService.queryById(id));
    }
    @ApiOperation("获取stopcard列表")
    @GetMapping("query")
    public Result<List<InspectionStopcard>> queryStopCard(String name) {

        return Result.success(this.inspectionStopcardService.queryAllByLimit(0,10));
    }
    @ApiOperation("提交stopcard")
    @GetMapping("insert")
    public Result<InspectionStopcard> insertStopCard(StopCardVO cardVO) {

        BeanCopier copier = BeanCopier.create(StopCardVO.class, InspectionStopcard.class, false);
        InspectionStopcard stopcard = new InspectionStopcard();
        copier.copy(cardVO, stopcard, null);
        return Result.success(this.inspectionStopcardService.insert(stopcard));
    }


}