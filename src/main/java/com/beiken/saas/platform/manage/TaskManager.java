package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.TaskQuery;
import com.beiken.saas.platform.biz.vo.*;
import com.beiken.saas.platform.enums.RigStatusEnum;
import com.beiken.saas.platform.mapper.BgInspectItemMapper;
import com.beiken.saas.platform.mapper.InspectTaskItemMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.mapper.RigMapper;
import com.beiken.saas.platform.pojo.*;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午6:56
 */
@Component
public class TaskManager {

    @Resource
    private InspectTaskMapper taskMapper;
    @Resource
    private InspectTaskItemMapper taskItemMapper;
    @Resource
    private BgInspectItemMapper bgInspectItemMapper;
    @Resource
    private RigMapper rigMapper;

    /**
     * 后台列表
     *
     * @param taskQuery
     * @return
     */
    public PageBo<TaskVO> list(TaskQuery taskQuery) {
        PageBo<TaskVO> pageBo = new PageBo<>();
        List<TaskVO> taskList = Lists.newArrayList();
        InspectTaskDOExample taskExample = buildTaskExample(taskQuery);
        List<InspectTaskDO> inspectTasks = taskMapper.selectByExample(taskExample);
        for (InspectTaskDO inspectTask : inspectTasks) {
            TaskVO taskVO = new TaskVO();
            BeanUtils.copyProperties(inspectTask, taskVO);
            taskList.add(taskVO);
        }
        long count = taskMapper.countByExample(taskExample);
        pageBo.setItemList(taskList);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    /**
     * 获取巡检任务
     *
     * @param userId
     * @return
     */
    public PageBo<TaskListVO> listByUser(Long userId, String rigCode, Integer pageNo, Integer pageSize) {
        PageBo<TaskListVO> pageBo = new PageBo<>();
        List<TaskListVO> taskList = Lists.newArrayList();

        //todo pbl 向上去子公司
        InspectTaskDOExample example = new InspectTaskDOExample();
        example.createCriteria().andInspectUserIdEqualTo(userId);
        List<InspectTaskDO> inspectTasks = taskMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(inspectTasks)) {
            return pageBo;
        }

        for (InspectTaskDO inspectTask : inspectTasks) {
            //todo pbl
//            TaskVO taskVO = new TaskVO();
//            BeanUtils.copyProperties(inspectTask, taskVO);
//            taskVO.setTaskStartTime(inspectTask.getStartTime());
//            taskVO.setTaskEndTime(inspectTask.getEndTime());
//
//            InspectTaskItemDOExample taskItemDOExample = new InspectTaskItemDOExample();
//            InspectTaskItemDOExample.Criteria criteria = taskItemDOExample.createCriteria().andTaskCodeEqualTo(inspectTask.getTaskCode());
//            Long totalNum = taskItemMapper.countByExample(taskItemDOExample);
//            criteria.andResultStatusEqualTo(TaskStatusEnum.BEGIN.getStatus());
//            Long finishNum = taskItemMapper.countByExample(taskItemDOExample);
//            taskVO.setItemNum(totalNum);
//            taskVO.setFinishTaskItemNum((double) ((finishNum == 0L ? 0L : finishNum) / ((totalNum == 0) ? 1 : totalNum)));
//            taskList.add(taskVO);
        }
        long count = taskMapper.countByExample(example);
        pageBo.setItemList(taskList);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    /**
     * 获取巡检任务检查项
     *
     * @param taskCode
     * @return
     */
    public PageBo<TaskItemListVO> listTaskItem(String taskCode) {
        PageBo<TaskItemListVO> pageBo = new PageBo<>();
//        List<TaskItemVO> taskItemList = Lists.newArrayList();
//
//        InspectTaskItemDOExample example = new InspectTaskItemDOExample();
//        example.createCriteria().andTaskCodeEqualTo(taskCode);
//        List<InspectTaskItemDO> taskItems = taskItemMapper.selectByExample(example);
//        Set<String> bgItemCodeSet = taskItems.stream().map(InspectTaskItemDO::getBgItemCode).collect(Collectors.toSet());
//
//        BgInspectItemDOExample bgItemExample = new BgInspectItemDOExample();
//        bgItemExample.createCriteria().andBgItemCodeIn(Lists.newArrayList(bgItemCodeSet));
//        List<BgInspectItemDO> bgInspectItems = bgInspectItemMapper.selectByExample(bgItemExample);
//        if (!CollectionUtils.isEmpty(bgInspectItems)) {
//            Map<String, BgInspectItemDO> bgItemMap = bgInspectItems.stream()
//                    .collect(Collectors.toMap(BgInspectItemDO::getBgItemCode, p -> p));
//            for (InspectTaskItemDO taskItem : taskItems) {
//                TaskItemVO taskItemVO = new TaskItemVO();
//                BeanUtils.copyProperties(taskItem, taskItemVO);
//                if (!bgItemMap.containsKey(taskItem.getBgItemCode())) {
//                    continue;
//                }
//                BeanUtils.copyProperties(bgItemMap.get(taskItem.getBgItemCode()), taskItemVO);
//                taskItemList.add(taskItemVO);
//            }
//        }
//        long count = taskItemMapper.countByExample(example);
//
//        pageBo.setItemList(taskItemList);
//        pageBo.setTotalSize(count);
        return pageBo;
    }

    public UserRigVO getTaskUserRig(Long userId) {
        UserRigVO userRigVO = new UserRigVO();
        userRigVO.setUserId(userId);


        RigDOExample rigExample = new RigDOExample();
        rigExample.createCriteria()
                .andStatusIn(Lists.newArrayList(RigStatusEnum.BEGIN.getStatus(), RigStatusEnum.FINISH.getStatus()));
        List<RigDO> rigDOLists = rigMapper.selectByExample(rigExample);

        //todo pbl 补逻辑
//
//        InspectTaskDOExample example = new InspectTaskDOExample();
//        example.createCriteria()
//                .andInspectUserIdEqualTo(userId)
//                .andStatusIn(Lists.newArrayList(TaskStatusEnum.BEGIN.getStatus(),
//                        TaskStatusEnum.FINISH.getStatus()));
//        List<InspectTaskDO> inspectTaskDOs = taskMapper.selectByExample(example);
//        if (CollectionUtils.isEmpty(inspectTaskDOs)) {
//            return null;
//        }
//        Set<Long> deptCodeSets = inspectTaskDOs.stream().map(InspectTaskDO::getDeptId).collect(Collectors.toSet());
//
//
//        if (CollectionUtils.isEmpty(rigDOLists)) {
//            return null;
//        }
//
//        List<DeptVO> deptList = Lists.newArrayList();
//        List<RigVO> rigList = Lists.newArrayList();
//        for (RigDO rigDO : rigDOLists) {
//            RigVO rigVO = new RigVO();
//            BeanUtils.copyProperties(rigDO, rigVO);
//            rigVO.setStatus(RigStatusEnum.index(rigDO.getStatus()).getMsg());
//            rigList.add(rigVO);
//
//            DeptVO deptVO = new DeptVO();
//            deptVO.setDeptId(rigDO.getDeptId());
//            deptVO.setDeptName(rigDO.getDeptName());
//            deptList.add(deptVO);
//        }
        return userRigVO;
    }

    //todo 需要插入隐患表中
    public void updateTaskItem(TaskItemVO taskItemVO) {

        InspectTaskItemDOExample example = new InspectTaskItemDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskItemVO.getItemCode());

        InspectTaskItemDO inspectTaskItem = new InspectTaskItemDO();
        BeanUtils.copyProperties(taskItemVO, inspectTaskItem);
        taskItemMapper.updateByExampleSelective(inspectTaskItem, example);
    }

    //todo 需要详细信息
    public TaskVO info(String taskCode) {
        TaskVO taskVO = new TaskVO();
        InspectTaskDOExample example = new InspectTaskDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode);
        List<InspectTaskDO> taskList = taskMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(taskList)) {
            InspectTaskDO inspectTask = taskList.get(0);
            BeanUtils.copyProperties(inspectTask, taskVO);
        }
        //todo
        return taskVO;
    }


    private InspectTaskDOExample buildTaskExample(TaskQuery taskQuery) {
        InspectTaskDOExample example = new InspectTaskDOExample();
        example.setLimitStart(taskQuery.getPageNo());
        example.setCount((taskQuery.getPageNo() - 1) * taskQuery.getPageSize());
        return example;
        /*
        if (StringUtils.isNotBlank(planQuery.getDeptName())) {
            InspectPlanDeptExample deptExample = new InspectPlanDeptDOExample();
            deptExample.createCriteria().andDeptNameLike(Constants.LIKE + planQuery.getDeptName() + Constants.LIKE);
            List<InspectPlanDept> inspectPlanDepts = inspectPlanDeptMapper.selectByExample(deptExample);
            Set<String> inspectPlanCodeSet = inspectPlanDepts.stream().map(InspectPlanDept::getInspcetPlanCode).collect(Collectors.toSet());
            criteria.andInspectPlanCodeIn(Lists.newArrayList(inspectPlanCodeSet));
        }*/

    }
}
