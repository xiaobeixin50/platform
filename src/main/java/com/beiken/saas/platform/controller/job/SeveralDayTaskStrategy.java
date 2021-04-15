package com.beiken.saas.platform.controller.job;

import com.beiken.saas.platform.biz.vo.InspectPlanVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.manage.BgManager;
import com.beiken.saas.platform.manage.RigManager;
import com.beiken.saas.platform.manage.TaskManager;
import com.beiken.saas.platform.mapper.InspectTaskItemMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.mapper.TaskUserMapper;
import com.beiken.saas.platform.pojo.*;
import com.beiken.saas.platform.utils.CodeUtil;
import com.beiken.saas.platform.utils.DateUtil;
import com.beiken.saas.platform.utils.DatesUtils;
import com.beiken.saas.platform.utils.SwitchUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 几天一次的策略
 */
@Component
public class SeveralDayTaskStrategy {

    @Resource
    private TaskManager taskManager;

    @Resource
    private SwitchUtil switchUtil;
    @Resource
    private InspectTaskMapper inspectTaskMapper;
    @Resource
    private TaskUserMapper taskUserMapper;
    @Resource
    private CodeUtil codeUtil;
    @Resource
    private RigManager rigManager;
    @Resource
    private InspectTaskItemMapper taskItemMapper;

    @Resource
    private BgManager bgManager;

    public boolean handle(InspectPlanVO inspectPlanVO) throws Exception {

        Date now = new Date();
        boolean b = canAdd(inspectPlanVO);
        if (!b && switchUtil.match("enableCreateTask", "false")) {
            return false;
        }
        for (DepartmentDO departmentDO : inspectPlanVO.getDeptList()) {
            List<RigDO> rigDOList = rigManager.getRigDOByDeptId(departmentDO.getId());
            for (RigDO rigDO : rigDOList) {
                String taskCode = codeUtil.buildTaskCode(departmentDO.getDeptCode());
                Long taskId = addTask(inspectPlanVO, now, taskCode, departmentDO, rigDO);
                if (taskId == null) {
                    throw new Exception("插入task失败");
                }
                addTaskUser(inspectPlanVO, now, taskId, taskCode);
                addTaskItem(inspectPlanVO, now, taskCode, rigDO, departmentDO);
            }

        }
        return true;
    }

    private boolean canAdd(InspectPlanVO inspectPlanVO) {
        Date now = new Date();
        long startDateLong = inspectPlanVO.getStartDate().getTime();
        long endDateLong = inspectPlanVO.getEndDate().getTime();
        if (now.getTime() < startDateLong || now.getTime() > endDateLong) {
            return false;
        }

        Date startDate = inspectPlanVO.getStartDate();
        Date endDate = inspectPlanVO.getEndDate();
        long tsStart = startDate.getTime();
        long tsNow = now.getTime();

        long days = (tsNow - tsStart) / (1000 * 60 * 60 * 24);
        Integer countDay = inspectPlanVO.getCountDay();
        int startDays = (int) days / countDay * countDay;
        int endDays = (int) days / countDay * countDay + countDay - 1;
        String startTime = inspectPlanVO.getStartTime();
        String endTime = inspectPlanVO.getEndTime();

        Date taskStartDate = DatesUtils.getBehindDay(startDate, startDays);
        Date taskEndDate = DatesUtils.getBehindDay(startDate, endDays);

        Date start = DateUtil.parseDate(DateUtil.formatDate(taskStartDate, DateUtil.DEFAULT_PARTERN).substring(0, 11) + startTime, DateUtil.DEFAULT_PARTERN);
        Date end = DateUtil.parseDate(DateUtil.formatDate(taskEndDate, DateUtil.DEFAULT_PARTERN).substring(0, 11) + endTime, DateUtil.DEFAULT_PARTERN);

        List<InspectTaskDO> taskDOList = taskManager.getTaskByPlanCode(inspectPlanVO.getInspectPlanCode(), start, end);
        //几天一次，所以判断size是1
        if (taskDOList != null && taskDOList.size() >= 1) {
            return false;
        }
        return true;
    }

    private void addTaskItem(InspectPlanVO inspectPlanVO, Date now
            , String taskCode, RigDO rigDO, DepartmentDO departmentDO) throws Exception {
        String bgCode = inspectPlanVO.getBgCode();
        List<BgInspectItemDO> itemDOList = bgManager.getBgItemByCode(bgCode);
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

    private void addTaskUser(InspectPlanVO inspectPlanVO, Date now, Long taskId, String taskCode) throws Exception {
        if (taskId == null) {
            return;
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

    private Long addTask(InspectPlanVO inspectPlanVO, Date now, String taskCode
            , DepartmentDO departmentDO, RigDO rigDO) {

        InspectTaskDO taskDO = new InspectTaskDO();
        taskDO.setGmtCreate(now);
        taskDO.setGmtModified(now);
        taskDO.setName(inspectPlanVO.getName());
        taskDO.setTaskCode(taskCode);
        taskDO.setInspectPlanCode(inspectPlanVO.getInspectPlanCode());
        processDate(inspectPlanVO, taskDO, now);
        taskDO.setStatus(Constants.ZERO_INT);
        taskDO.setQuickly(inspectPlanVO.getPriority());
        taskDO.setDeptId(departmentDO.getId());
        taskDO.setDeptName(departmentDO.getDeptName());
        taskDO.setRigCode(rigDO.getRigCode());
        int insert = inspectTaskMapper.insert(taskDO);
        if (insert > 0) {
            return taskDO.getId();
        }
        return null;
    }

    private void processDate(InspectPlanVO inspectPlanVO, InspectTaskDO taskDO, Date now) {
        Date startDate = inspectPlanVO.getStartDate();
        Date endDate = inspectPlanVO.getEndDate();

        long days = DatesUtils.getDiffDays(startDate, now);
        Integer countDay = inspectPlanVO.getCountDay();

        int startDays = (int) days / countDay * countDay;
        int endDays = (int) days / countDay * countDay + countDay - 1;
        String startTime = inspectPlanVO.getStartTime();
        String endTime = inspectPlanVO.getEndTime();

        Date taskStartDate = DatesUtils.getBehindDay(startDate, startDays);
        Date taskEndDate = DatesUtils.getBehindDay(startDate, endDays);

        Date start = DateUtil.parseDate(DateUtil.formatDate(taskStartDate, DateUtil.DEFAULT_PARTERN).substring(0, 11) + startTime, DateUtil.DEFAULT_PARTERN);
        Date end = DateUtil.parseDate(DateUtil.formatDate(taskEndDate, DateUtil.DEFAULT_PARTERN).substring(0, 11) + endTime, DateUtil.DEFAULT_PARTERN);
        taskDO.setStartTime(start);
        taskDO.setEndTime(end);
    }

}
