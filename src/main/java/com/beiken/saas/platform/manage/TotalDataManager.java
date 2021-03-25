package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

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

    public void countDanger(Date startTime, Date endTime) {
        //danger
        HiddenDangerDOExample dangerDOExample = new HiddenDangerDOExample();
        HiddenDangerDOExample.Criteria criteria = dangerDOExample.createCriteria()
                .andGmtCreateGreaterThanOrEqualTo(startTime)
                .andGmtCreateLessThanOrEqualTo(endTime);
        long countAllDanger = dangerMapper.countByExample(dangerDOExample);
        criteria.andReportStatusIn(Lists.newArrayList(
                DangerStatusEnum.FINISH.getStatus(), DangerStatusEnum.CLOSE.getStatus()));
        long countFinishDanger = dangerMapper.countByExample(dangerDOExample);
    }


}
