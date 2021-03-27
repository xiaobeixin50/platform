package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.vo.TotalDataVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.enums.TaskStatusEnum;
import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.DepartmentDO;
import com.beiken.saas.platform.pojo.DepartmentDOExample;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import com.beiken.saas.platform.pojo.InspectTaskDOExample;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
                DangerStatusEnum.FINISH.getStatus(), DangerStatusEnum.CLOSE.getStatus()));
        long countFinishDanger = dangerMapper.countByExample(dangerDOExample);

        totalDataVO.setDangerNum(countAllDanger);
        totalDataVO.setFinishDangerNum(countFinishDanger);
        return totalDataVO;
    }

    public Map<String, Double> totalCompany(Date startTime, Date endTime) {
        Map<String, Double> valueMap = Maps.newHashMap();

        DepartmentDOExample example = new DepartmentDOExample();
        example.createCriteria().andLevelEqualTo(Constants.TWO_INT);
        List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(example);
        return null;

       /* for (DepartmentDO departmentDO : departmentDOs) {
            HiddenDangerDOExample dangerDOExample = new HiddenDangerDOExample();
            HiddenDangerDOExample.Criteria criteria = dangerDOExample.createCriteria();
            if (Objects.nonNull(startTime)) {
                criteria.andGmtCreateGreaterThanOrEqualTo(startTime);
            }
            if (Objects.nonNull(endTime)) {
                criteria.andGmtCreateLessThanOrEqualTo(endTime);
            }
            criteria.andDeptIdIn()
            dangerMapper.countByExample(dangerDOExample);
        }*/
    }

    public TotalDataVO countTask(Date startTime, Date endTime) {
        TotalDataVO totalDataVO = new TotalDataVO();
        //task
        InspectTaskDOExample taskDOExample = new InspectTaskDOExample();
        InspectTaskDOExample.Criteria criteria = taskDOExample.createCriteria();
        if (Objects.nonNull(startTime)) {
            criteria.andStartTimeLessThanOrEqualTo(startTime);
        }
        if (Objects.nonNull(endTime)) {
            criteria.andEndTimeGreaterThanOrEqualTo(endTime);
        }
        long countAllTask = taskMapper.countByExample(taskDOExample);
        criteria.andStatusEqualTo(TaskStatusEnum.AFTER_TIME.getStatus());
        long countAfterTimeTask = taskMapper.countByExample(taskDOExample);

        totalDataVO.setTaskNum(countAllTask);
        totalDataVO.setLimitTimeNum(countAfterTimeTask);
        return totalDataVO;
    }


}
