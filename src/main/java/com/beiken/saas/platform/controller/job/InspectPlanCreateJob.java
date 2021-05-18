package com.beiken.saas.platform.controller.job;

import com.beiken.saas.platform.biz.vo.InspectPlanVO;
import com.beiken.saas.platform.manage.InspectPlanManager;
import com.beiken.saas.platform.manage.RigManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 检查计划的生成任务
 */
@Component
public class InspectPlanCreateJob {
    @Autowired
    private EveryDayTaskStrategy everyDayTaskStrategy;

    @Autowired
    private SeveralDayTaskStrategy severalDayTaskStrategy;

    @Resource
    private InspectPlanManager inspectPlanManager;
    @Resource
    private RigManager rigManager;

    //@Scheduled(cron = "0 15 4 ? * *")
    @Scheduled(fixedDelay = 300000)
    @Transactional(rollbackFor = Exception.class)
    public void createTask() throws Exception {
        List<InspectPlanVO> inspectPlanVOs = inspectPlanManager.queryStartPlan();
        //遍历计划，判断使用使用哪种策略
        for (InspectPlanVO inspectPlanVO : inspectPlanVOs) {
            //目前只有两种，不是一天几次，就是几天一次，如有则扩展策略
            if (inspectPlanVO.getEveryDay() != null && inspectPlanVO.getEveryDay() >= 1) {
                everyDayTaskStrategy.handle(inspectPlanVO);
            } else {
                severalDayTaskStrategy.handle(inspectPlanVO);
            }
        }
    }
}
