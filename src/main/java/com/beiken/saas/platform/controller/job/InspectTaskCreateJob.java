package com.beiken.saas.platform.controller.job;

import com.beiken.saas.platform.biz.vo.InspectPlanVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.manage.*;
import com.beiken.saas.platform.mapper.InspectTaskItemMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.mapper.TaskUserMapper;
import com.beiken.saas.platform.pojo.*;
import com.beiken.saas.platform.utils.CodeUtil;
import com.beiken.saas.platform.utils.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/29
 * Time: 下午1:15
 */
@Component
public class InspectTaskCreateJob {

    @Resource
    private InspectPlanManager inspectPlanManager;
    @Resource
    private TaskManager taskManager;
    @Resource
    private InspectTaskMapper inspectTaskMapper;
    @Resource
    private TaskUserMapper taskUserMapper;
    @Resource
    private CodeUtil codeUtil;
    @Resource
    private BgManager bgManager;
    @Resource
    private DepartManager departManager;
    @Resource
    private RigManager rigManager;
    @Resource
    private InspectTaskItemMapper taskItemMapper;


    @Scheduled(fixedDelay = 60000)
    @Transactional(rollbackFor = Exception.class)
    public void createTask() throws Exception {
        List<InspectPlanVO> inspectPlanVOs = inspectPlanManager.queryStartPlan();
        Date now = new Date();
        for (InspectPlanVO inspectPlanVO : inspectPlanVOs) {
            boolean b = canAdd(inspectPlanVO, now);
            b = false;
            if (!b) {
                continue;
            }

            String taskCode = codeUtil.buildTaskCode(inspectPlanVO.getDeptList().get(0).getDeptCode());
            Long taskId = addTask(inspectPlanVO, now, taskCode);
            if (taskId == null) {
                throw new Exception("插入task失败");
            }
            addTaskUser(inspectPlanVO, now, taskId, taskCode);
            addTaskItem(inspectPlanVO, now, taskCode);
        }
    }

    private boolean canAdd(InspectPlanVO inspectPlanVO, Date now) {
        long startDateLong = inspectPlanVO.getStartDate().getTime();
        long endDateLong = inspectPlanVO.getEndDate().getTime();
        if (now.getTime() < startDateLong || now.getTime() > endDateLong) {
            return false;
        }

        String startTime = inspectPlanVO.getStartTime();
        String endTime = inspectPlanVO.getEndTime();
        Date start = DateUtil.parseDate(DateUtil.formatDate(now, DateUtil.DEFAULT_PARTERN).substring(0, 11) + startTime, DateUtil.DEFAULT_PARTERN);
        Date end = DateUtil.parseDate(DateUtil.formatDate(now, DateUtil.DEFAULT_PARTERN).substring(0, 11) + endTime, DateUtil.DEFAULT_PARTERN);

        List<InspectTaskDO> taskDOList = taskManager.getTaskByPlanCode(inspectPlanVO.getInspectPlanCode(), start, end);
        if (taskDOList.size() >= inspectPlanVO.getEveryDay()) {
            return false;
        }
        return true;
    }

    private void addTaskItem(InspectPlanVO inspectPlanVO, Date now, String taskCode) throws Exception {
        String bgCode = inspectPlanVO.getBgCode();
        List<BgInspectItemDO> itemDOList = bgManager.getBgItemByCode(bgCode);
        for (DepartmentDO departmentDO : inspectPlanVO.getDeptList()) {
            List<RigDO> rigDOs = rigManager.getRigDOByDeptId(departmentDO.getId());
            for (RigDO rigDO : rigDOs) {
                for (BgInspectItemDO itemDO : itemDOList) {
                    InspectTaskItemDO taskItemDO = new InspectTaskItemDO();
                    taskItemDO.setGmtCreate(now);
                    taskItemDO.setGmtModified(now);
                    taskItemDO.setTaskCode(taskCode);
                    taskItemDO.setBgItemCode(itemDO.getBgItemCode());
                    taskItemDO.setRigCode(rigDO.getRigCode());
                    taskItemDO.setDeptId(departmentDO.getId());
                    taskItemDO.setRigId(rigDO.getId());
                    int insert = taskItemMapper.insert(taskItemDO);
                    if (insert < 1) {
                        throw new Exception("插入taskItem失败");
                    }
                }
            }
        }
    }

    private void addTaskUser(InspectPlanVO inspectPlanVO, Date now, Long taskId, String taskCode) throws Exception {
        if (taskId == null) {
            return ;
        }
        for (UserDO userDO : inspectPlanVO.getInspectUserList()) {
            TaskUserDO taskUserDO = new TaskUserDO();
            taskUserDO.setGmtCreate(now);
            taskUserDO.setGmtModified(now);
            taskUserDO.setTaskId(taskId);
            taskUserDO.setTaskCode(taskCode);
            taskUserDO.setInspectUserId(userDO.getId());
            taskUserDO.setInspectUserName(userDO.getName());
            Date startDate = inspectPlanVO.getStartDate();
            String startTime = inspectPlanVO.getStartTime();
            Date start = DateUtil.parseDate(DateUtil.formatDate(startDate, DateUtil.DEFAULT_PARTERN).substring(0, 11) + startTime, DateUtil.DEFAULT_PARTERN);
            taskUserDO.setTaskStartTime(start);
            int insert = taskUserMapper.insert(taskUserDO);
            if (insert < 1) {
                throw new Exception("插入taskItem失败");
            }
        }
    }

    private Long addTask(InspectPlanVO inspectPlanVO, Date now, String taskCode) {
        InspectTaskDO taskDO = new InspectTaskDO();
        taskDO.setGmtCreate(now);
        taskDO.setGmtModified(now);
        taskDO.setName(inspectPlanVO.getName());
        taskDO.setTaskCode(taskCode);
        taskDO.setInspectPlanCode(inspectPlanVO.getInspectPlanCode());
        processDate(inspectPlanVO, taskDO, now);
        taskDO.setStatus(Constants.ZERO_INT);
        taskDO.setQuickly(inspectPlanVO.getPriority());
        int insert = inspectTaskMapper.insert(taskDO);
        if (insert > 0) {
            return taskDO.getId();
        }
        return null;
    }

    private void processDate(InspectPlanVO inspectPlanVO, InspectTaskDO taskDO, Date now) {
        String startTime = inspectPlanVO.getStartTime();
        String endTime = inspectPlanVO.getEndTime();
        Date start = DateUtil.parseDate(DateUtil.formatDate(now, DateUtil.DEFAULT_PARTERN).substring(0, 11) + startTime, DateUtil.DEFAULT_PARTERN);
        Date end = DateUtil.parseDate(DateUtil.formatDate(now, DateUtil.DEFAULT_PARTERN).substring(0, 11) + endTime, DateUtil.DEFAULT_PARTERN);
        taskDO.setStartTime(start);
        taskDO.setEndTime(end);
    }


}