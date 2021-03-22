package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    private Map<String, List<GeneratorVO>> result = Maps.newLinkedHashMap();

    @ApiOperation("字典表")
    @ResponseBody
    @GetMapping(value = "/list")
    public Result list() {
        try {
            List<GeneratorVO> dangerStatusList = getDangerStatus();
            List<GeneratorVO> dangerLevel = getDangerLevel();
            List<GeneratorVO> dangerReortType = getDangerReortType();

            result.put("DANGER_LEVEL", dangerLevel);
            result.put("DANGER_STATUS", dangerStatusList);
            result.put("DANGER_REPORT_TYPE", dangerReortType);
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
            List<EquipmentVO> voList = Lists.newArrayList();
            EquipmentVO equipmentVO1 = new EquipmentVO();
            EquipmentVO equipmentVO2 = new EquipmentVO();
            EquipmentVO equipmentVO3 = new EquipmentVO();
            EquipmentVO equipmentVO4 = new EquipmentVO();
            EquipmentVO equipmentVO5 = new EquipmentVO();
            EquipmentVO equipmentVO6 = new EquipmentVO();

            equipmentVO1.setValue("非行为/井控管理");
            List<EquipmentVO> list = Lists.newArrayList();
            List<EquipmentVO> list2 = Lists.newArrayList();
            equipmentVO2.setValue("远控台");
            equipmentVO4.setValue("压力表");
            equipmentVO5.setValue("油雾器");
            equipmentVO6.setValue("气泵");
            equipmentVO3.setValue("司控台");
            list.add(equipmentVO2);
            list.add(equipmentVO3);
            list2.add(equipmentVO4);
            list2.add(equipmentVO5);
            list2.add(equipmentVO6);
            equipmentVO1.setVoList(list);
            equipmentVO2.setVoList(list2);

            voList.add(equipmentVO1);

            return Result.success(voList);
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
            DeptStructVO deptStructVO = new DeptStructVO();
            DeptVO deptVO1 = new DeptVO();
            deptVO1.setDeptId(1L);
            deptVO1.setDeptName("北疆油服第一公司");
            deptStructVO.setDeptVO(deptVO1);
            List<DeptStructVO> children = Lists.newArrayList();
            DeptStructVO deptStructVO2 = new DeptStructVO();
            DeptStructVO deptStructVO3 = new DeptStructVO();
            DeptVO deptVO2 = new DeptVO();
            deptVO2.setDeptId(2L);
            deptVO2.setDeptName("21井队");
            deptStructVO2.setDeptVO(deptVO2);
            DeptVO deptVO3 = new DeptVO();
            deptVO3.setDeptId(3L);
            deptVO3.setDeptName("22井队");
            deptStructVO3.setDeptVO(deptVO3);
            children.add(deptStructVO2);
            children.add(deptStructVO3);
            deptStructVO.setChildren(children);

            RigVO rigVO1 = new RigVO();
            rigVO1.setId(1L);
            rigVO1.setRigCode("FNIW23221");
            RigVO rigVO2 = new RigVO();
            rigVO2.setId(2L);
            rigVO2.setRigCode("NUEW8343");
            List<RigVO> rigVOs = Lists.newArrayList();
            rigVOs.add(rigVO1);
            rigVOs.add(rigVO2);
            deptStructVO2.setRigVOs(rigVOs);
            result.add(deptStructVO);

            return Result.success(result);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    private List<GeneratorVO> getDangerStatus() {
        GeneratorVO generatorVO1 = new GeneratorVO();
        generatorVO1.setCode("DANGER_STATUS");
        generatorVO1.setText("已解决");
        generatorVO1.setValue("0");
        GeneratorVO generatorVO2 = new GeneratorVO();
        GeneratorVO generatorVO3 = new GeneratorVO();
        GeneratorVO generatorVO4 = new GeneratorVO();
        GeneratorVO generatorVO5 = new GeneratorVO();
        GeneratorVO generatorVO6 = new GeneratorVO();
        GeneratorVO generatorVO7 = new GeneratorVO();

        generatorVO2.setCode("DANGER_STATUS");
        generatorVO2.setText("待分级");
        generatorVO2.setValue("1");

        generatorVO3.setCode("DANGER_STATUS");
        generatorVO3.setText("待环保部门出方案");
        generatorVO3.setValue("2");

        generatorVO4.setCode("DANGER_STATUS");
        generatorVO4.setText("待责任单位出方案");
        generatorVO4.setValue("3");

        generatorVO5.setCode("DANGER_STATUS");
        generatorVO5.setText("待整改");
        generatorVO5.setValue("4");

        generatorVO6.setCode("DANGER_STATUS");
        generatorVO6.setText("待环保部门验收");
        generatorVO6.setValue("5");

        generatorVO7.setCode("DANGER_STATUS");
        generatorVO7.setText("待确认");
        generatorVO7.setValue("6");
        List<GeneratorVO> dangerList = Lists.newArrayList();
        dangerList.add(generatorVO7);
        dangerList.add(generatorVO6);
        dangerList.add(generatorVO5);
        dangerList.add(generatorVO4);
        dangerList.add(generatorVO3);
        dangerList.add(generatorVO2);
        dangerList.add(generatorVO1);
        return dangerList;
    }

    private List<GeneratorVO> getDangerLevel() {
        GeneratorVO generatorVO1 = new GeneratorVO();
        generatorVO1.setCode("DANGER_LEVEL");
        generatorVO1.setText("一级隐患");
        generatorVO1.setValue("0");
        GeneratorVO generatorVO2 = new GeneratorVO();
        GeneratorVO generatorVO3 = new GeneratorVO();
        GeneratorVO generatorVO4 = new GeneratorVO();

        generatorVO2.setCode("DANGER_LEVEL");
        generatorVO2.setText("二级隐患");
        generatorVO2.setValue("1");

        generatorVO3.setCode("DANGER_LEVEL");
        generatorVO3.setText("三级隐患");
        generatorVO3.setValue("2");

        generatorVO4.setCode("DANGER_LEVEL");
        generatorVO4.setText("四级隐患");
        generatorVO4.setValue("3");

        List<GeneratorVO> dangerList = Lists.newArrayList();

        dangerList.add(generatorVO3);
        dangerList.add(generatorVO4);
        dangerList.add(generatorVO2);
        dangerList.add(generatorVO1);
        return dangerList;
    }

    private List<GeneratorVO> getDangerReortType() {
        GeneratorVO generatorVO1 = new GeneratorVO();
        generatorVO1.setCode("DANGER_REPORT_TYPE");
        generatorVO1.setText("任务上报");
        generatorVO1.setValue("0");
        GeneratorVO generatorVO2 = new GeneratorVO();


        generatorVO2.setCode("DANGER_REPORT_TYPE");
        generatorVO2.setText("现场快报");
        generatorVO2.setValue("1");

        List<GeneratorVO> dangerList = Lists.newArrayList();

        dangerList.add(generatorVO2);
        dangerList.add(generatorVO1);
        return dangerList;
    }
}
