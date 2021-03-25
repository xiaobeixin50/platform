package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.DeptStructVO;
import com.beiken.saas.platform.biz.vo.EquipmentVO;
import com.beiken.saas.platform.biz.vo.GeneratorVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.DangerLevelEnum;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.enums.ReportTypeEnum;
import com.beiken.saas.platform.manage.BgManager;
import com.beiken.saas.platform.pojo.BgInspectItemDO;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/3/3
 * Time: 下午12:38
 */
@Api(value = "/generator", description = "字典表", tags = "字典表")
@RestController
@RequestMapping("/generator")
public class GeneratorController {

    @Resource
    private UserController userController;
    @Resource
    private BgManager bgManager;

    private Map<String, List<GeneratorVO>> result = Maps.newLinkedHashMap();

    @ApiOperation("字典表")
    @ResponseBody
    @GetMapping(value = "/list")
    public Result list() {
        try {
            List<GeneratorVO> dangerStatusList = getDangerStatus();
            List<GeneratorVO> dangerLevel = getDangerLevel();
            List<GeneratorVO> dangerReportType = getDangerReportType();

            result.put("DANGER_LEVEL", dangerLevel);
            result.put("DANGER_STATUS", dangerStatusList);
            result.put("DANGER_REPORT_TYPE", dangerReportType);
            return Result.success(result);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("隐患设备筛选")
    @ResponseBody
    @GetMapping(value = "/equipment/type")
    public Result equipment() {
        try {
            List<EquipmentVO> result = Lists.newArrayList();
            List<BgInspectItemDO> all = bgManager.getAll();
            Map<String, Map<String, List<EquipmentVO>>> map = bgManager.buildEquipment(all);
            for (String s : map.keySet()) {
                EquipmentVO equipmentVO = new EquipmentVO();
                equipmentVO.setValue(s);
                equipmentVO.setVoList(Lists.newArrayList());
                for (List<EquipmentVO> list : map.get(s).values()) {
                    for (EquipmentVO value : list) {
                        EquipmentVO child = new EquipmentVO();
                        child.setValue(value.getValue());
                        child.setVoList(value.getVoList());
                        child.setBgItemCode(value.getBgItemCode());
                        equipmentVO.getVoList().add(child);
                    }
                }
                result.add(equipmentVO);
            }
            return Result.success(result);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("组织结构筛选")
    @ResponseBody
    @GetMapping(value = "/dept/struct")
    public Result deptStruce() {
        try {
            List<DeptStructVO> result = Lists.newArrayList();
            Map<String, Map<String, List<DeptStructVO>>> rigStruct = userController.getUserRigStruct();

            for (String s : rigStruct.keySet()) {
                DeptStructVO deptStructVO = new DeptStructVO();
                deptStructVO.setValue(s);
                deptStructVO.setVoList(Lists.newArrayList());
                Collection<List<DeptStructVO>> values = rigStruct.get(s).values();
                for (List<DeptStructVO> value : values) {
                    for (DeptStructVO structVO : value) {
                        DeptStructVO child = new DeptStructVO();
                        child.setValue(structVO.getValue());
                        child.setVoList(structVO.getVoList());
                        deptStructVO.getVoList().add(child);
                    }

                }
                result.add(deptStructVO);
            }
            return Result.success(result);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    private List<GeneratorVO> getDangerStatus() {
        List<GeneratorVO> dangerList = Lists.newArrayList();
        for (Map.Entry<Integer, DangerStatusEnum> entry : DangerStatusEnum.MAP.entrySet()) {
            GeneratorVO generatorVO = new GeneratorVO();
            generatorVO.setCode("DANGER_STATUS");
            generatorVO.setText(entry.getValue().getMsg());
            generatorVO.setValue(entry.getValue().getStatus().toString());
            dangerList.add(generatorVO);
        }

        return dangerList;
    }

    private List<GeneratorVO> getDangerLevel() {
        List<GeneratorVO> dangerList = Lists.newArrayList();

        for (Map.Entry<Integer, DangerLevelEnum> entry : DangerLevelEnum.MAP.entrySet()) {
            GeneratorVO generatorVO = new GeneratorVO();
            generatorVO.setCode("DANGER_LEVEL");
            generatorVO.setText(entry.getValue().getMsg());
            generatorVO.setValue(entry.getValue().getStatus().toString());
            dangerList.add(generatorVO);
        }
        return dangerList;
    }

    private List<GeneratorVO> getDangerReportType() {
        List<GeneratorVO> dangerList = Lists.newArrayList();
        for (Map.Entry<Integer, ReportTypeEnum> entry : ReportTypeEnum.MAP.entrySet()) {
            GeneratorVO generatorVO = new GeneratorVO();
            generatorVO.setCode("DANGER_REPORT_TYPE");
            generatorVO.setText(entry.getValue().getMsg());
            generatorVO.setValue(entry.getKey().toString());
            dangerList.add(generatorVO);
        }
        return dangerList;
    }
}
