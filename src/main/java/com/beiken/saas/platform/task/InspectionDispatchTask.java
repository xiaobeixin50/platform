package com.beiken.saas.platform.task;

import com.beiken.saas.platform.mapper.InspectionItemMapper;
import com.beiken.saas.platform.mapper.InspectionItemPlanMapper;
import com.beiken.saas.platform.mapper.InspectionTaskMapper;
import com.beiken.saas.platform.mapper.MineProjectMapper;
import com.beiken.saas.platform.pojo.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class InspectionDispatchTask {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    private InspectionItemPlanMapper inspectionItemPlanMapper;

    @Autowired
    private InspectionTaskMapper inspectionTaskMapper;

    @Autowired
    private InspectionItemMapper inspectionItemMapper;

    @Autowired
    private MineProjectMapper mineProjectMapper;



    //这个时间之后再调试
    @Scheduled(cron = "0 0 1 * * ?")
    public void dispatchTask() {
        System.out.println("NOW：" + sdf.format(new Date()));


        InspectionItemPlanExample inspectionItemPlanExample = new InspectionItemPlanExample();
        List<InspectionItemPlan> inspectionItemPlans = inspectionItemPlanMapper.selectByExample(inspectionItemPlanExample);

        List<MineProject> mineProjects = mineProjectMapper.selectByExample(new MineProjectExample());
        for(MineProject project : mineProjects){
            //判断当天是否已经有任务了
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);

            Date startTime = cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH , 1);
            Date endTime = cal.getTime();

            InspectionTaskExample taskExample = new InspectionTaskExample();
            taskExample.createCriteria().andDispatchTimeBetween(startTime, endTime).andProjetIdEqualTo(project.getId());
            List<InspectionTask> inspectionTasks = inspectionTaskMapper.selectByExample(taskExample);
            if(inspectionTasks != null && inspectionTasks.size() >=1){
                System.out.println("task already exist!");
                return ;
            }


            //先添加一个任务
            InspectionTask task = new InspectionTask();
            task.setCreator("system");
            task.setModifier("system");
            task.setGmtCreate(new Date());
            task.setGmtModified(new Date());
            task.setTitle(project.getName() + "检查任务" + sdf.format(new Date()));
            task.setDispatchTime(new Date());
            task.setStatus(0);
            task.setProjetId(project.getId());
            task.setDemandTime(new Date());
            //TODO:需要完善逻辑
            task.setEmpId(1L);
            task.setDepId(project.getDepId());
            inspectionTaskMapper.insertSelective(task);

            inspectionItemPlans.stream().forEach(item ->{
                InspectionItem inspectionItem = new InspectionItem();
                inspectionItem.setCategory(item.getCategoryFourth());
                inspectionItem.setTaskId(task.getId());
                inspectionItem.setCode("");
                inspectionItem.setCreator("system");
                inspectionItem.setDepId(project.getDepId());
                inspectionItem.setModifier("system");
                inspectionItem.setLevel(item.getLevel());
                inspectionItem.setGmtCreate(new Date());
                inspectionItem.setGmtModified(new Date());
                inspectionItem.setDescription(item.getContent());
                inspectionItem.setProjectId(project.getId());

                //TODO:rfid如何生成
                inspectionItem.setRfid("testRfid");
                inspectionItemMapper.insert(inspectionItem);
            });
        }





    }

}
