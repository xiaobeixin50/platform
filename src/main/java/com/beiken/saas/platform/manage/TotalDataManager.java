package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.vo.TotalDataVO;
import com.beiken.saas.platform.enums.DangerLevelEnum;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.enums.TaskStatusEnum;
import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.InspectDeptMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/3/25
 * Time: 下午7:54
 */
@Component
public class TotalDataManager {

    @Resource
    private HiddenDangerMapper dangerMapper;
    @Resource
    private InspectTaskMapper taskMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private InspectDeptMapper inspectDeptMapper;

    public TotalDataVO countDanger(Date startTime, Date endTime) {
        TotalDataVO totalDataVO = new TotalDataVO();
        HiddenDangerDOExample dangerDOExample = new HiddenDangerDOExample();
        HiddenDangerDOExample.Criteria criteria = dangerDOExample.createCriteria();
        if (Objects.nonNull(startTime)) {
            criteria.andGmtCreateGreaterThanOrEqualTo(startTime);
        }
        if (Objects.nonNull(endTime)) {
            criteria.andGmtCreateLessThanOrEqualTo(endTime);
        }
        long countAllDanger = dangerMapper.countByExample(dangerDOExample);
        criteria.andReportStatusIn(Lists.newArrayList(
                DangerStatusEnum.FINISH.getStatus()));
        long countFinishDanger = dangerMapper.countByExample(dangerDOExample);

        totalDataVO.setDangerNum(countAllDanger);
        totalDataVO.setFinishDangerNum(countFinishDanger);
        return totalDataVO;
    }

    public Map<String, Double> totalCompany(Date startTime, Date endTime) {
        Map<String, Long> valueMap = Maps.newHashMap();
        Map<String, Double> result = Maps.newHashMap();

        List<InspectDeptDO> inspectDeptDOs = inspectDeptMapper.selectByExample(new InspectDeptDOExample());
        Set<Long> deptIds = inspectDeptDOs.stream().map(InspectDeptDO::getDeptId).collect(Collectors.toSet());
        DepartmentDOExample departmentDOExample = new DepartmentDOExample();
        departmentDOExample.createCriteria().andIdIn(Lists.newArrayList(deptIds));
        List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(departmentDOExample);

        for (DepartmentDO departmentDO : departmentDOs) {
            DepartmentDO parentDept = departmentMapper.selectByPrimaryKey(departmentDO.getParentId());
            if (!valueMap.containsKey(parentDept.getDeptName())) {
                valueMap.put(parentDept.getDeptName(), 0L);
            }
            HiddenDangerDOExample dangerDOExample = new HiddenDangerDOExample();
            HiddenDangerDOExample.Criteria criteria = dangerDOExample.createCriteria();
            if (Objects.nonNull(startTime)) {
                criteria.andReportTimeGreaterThanOrEqualTo(startTime);
            }
            if (Objects.nonNull(endTime)) {
                criteria.andReportTimeLessThanOrEqualTo(endTime);
            }
            criteria.andDeptIdEqualTo(departmentDO.getId());
            long num = dangerMapper.countByExample(dangerDOExample);
            valueMap.put(parentDept.getDeptName(), valueMap.get(parentDept.getDeptName()) + num);
        }

        Long sum = 0L;
        for (Long count : valueMap.values()) {
            sum += count;
        }
        for (Map.Entry<String, Long> entry : valueMap.entrySet()) {
            BigDecimal bg = new BigDecimal(entry.getValue().doubleValue() / (sum == 0L ? 1 : sum) * 100);
            result.put(entry.getKey(), bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }

        return result;
    }

    public Map<String, Double> totalDangerLevel(Date startTime, Date endTime) {
        Map<String, Long> valueMap = Maps.newHashMap();
        Map<String, Double> result = Maps.newHashMap();


        for (Integer level : DangerLevelEnum.MAP.keySet()) {
            HiddenDangerDOExample dangerDOExample = new HiddenDangerDOExample();
            HiddenDangerDOExample.Criteria criteria = dangerDOExample.createCriteria();
            if (Objects.nonNull(startTime)) {
                criteria.andGmtCreateGreaterThanOrEqualTo(startTime);
            }
            if (Objects.nonNull(endTime)) {
                criteria.andGmtCreateLessThanOrEqualTo(endTime);
            }
            criteria.andDangerLevelEqualTo(level);
            long count = dangerMapper.countByExample(dangerDOExample);
            valueMap.put(DangerLevelEnum.MAP.get(level).getMsg(), count);
        }
        Long sum = 0L;
        for (Long count : valueMap.values()) {
            sum += count;
        }
        for (Map.Entry<String, Long> entry : valueMap.entrySet()) {
            BigDecimal bg = new BigDecimal(entry.getValue().doubleValue() / (sum == 0L ? 1 : sum) * 100);
            result.put(entry.getKey(), bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        return result;
    }

    public TotalDataVO countTask(Date startTime, Date endTime) {
        TotalDataVO totalDataVO = new TotalDataVO();
        //task
        InspectTaskDOExample taskDOExample = new InspectTaskDOExample();
        InspectTaskDOExample.Criteria criteria = taskDOExample.createCriteria();
        if (Objects.nonNull(startTime)) {
            criteria.andStartTimeGreaterThanOrEqualTo(startTime);
        }
        if (Objects.nonNull(endTime)) {
            criteria.andEndTimeLessThanOrEqualTo(endTime);
        }
        long countAllTask = taskMapper.countByExample(taskDOExample);
        criteria.andStatusEqualTo(TaskStatusEnum.AFTER_TIME.getStatus());
        long countAfterTimeTask = taskMapper.countByExample(taskDOExample);

        totalDataVO.setTaskNum(countAllTask);
        totalDataVO.setLimitTimeNum(countAfterTimeTask);
        return totalDataVO;
    }


}
