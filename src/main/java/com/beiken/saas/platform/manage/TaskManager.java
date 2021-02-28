package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.TaskQuery;
import com.beiken.saas.platform.biz.vo.TaskItemVO;
import com.beiken.saas.platform.biz.vo.TaskVO;
import com.beiken.saas.platform.mapper.BgInspectItemMapper;
import com.beiken.saas.platform.mapper.InspectTaskItemMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.*;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

    /**
     * 后台列表
     * @param taskQuery
     * @return
     */
    public PageBo<TaskVO> list(TaskQuery taskQuery) {
        PageBo<TaskVO> pageBo = new PageBo<>();
        List<TaskVO> taskList = Lists.newArrayList();
        InspectTaskExample taskExample = buildTaskExample(taskQuery);
        List<InspectTask> inspectTasks = taskMapper.selectByExample(taskExample);
        for (InspectTask inspectTask : inspectTasks) {
            TaskVO taskVO = new TaskVO();
            BeanUtils.copyProperties(inspectTask, taskVO);
            taskList.add(taskVO);
        }
        long count = taskMapper.countByExample(taskExample);
        pageBo.setItemList(taskList);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    public PageBo<TaskVO> listByUser(Long inspectUserId) {
        PageBo<TaskVO> pageBo = new PageBo<>();
        List<TaskVO> taskList = Lists.newArrayList();

        InspectTaskExample example = new InspectTaskExample();
        example.createCriteria().andInspectUserIdEqualTo(inspectUserId);
        List<InspectTask> inspectTasks = taskMapper.selectByExample(example);
        for (InspectTask inspectTask : inspectTasks) {
            TaskVO taskVO = new TaskVO();
            BeanUtils.copyProperties(inspectTask, taskVO);
            taskVO.setTaskStartTime(inspectTask.getStartTime());
            taskVO.setTaskEndTime(inspectTask.getEndTime());
            taskList.add(taskVO);
        }
        long count = taskMapper.countByExample(example);
        pageBo.setItemList(taskList);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    public PageBo<TaskItemVO> listTaskItem(String taskCode) {
        PageBo<TaskItemVO> pageBo = new PageBo<>();
        List<TaskItemVO> taskItemList = Lists.newArrayList();

        InspectTaskItemExample example = new InspectTaskItemExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode);
        List<InspectTaskItem> taskItems = taskItemMapper.selectByExample(example);
        Set<String> bgItemCodeSet = taskItems.stream().map(InspectTaskItem::getBgItemCode).collect(Collectors.toSet());

        BgInspectItemExample bgItemExample = new BgInspectItemExample();
        bgItemExample.createCriteria().andBgItemCodeIn(Lists.newArrayList(bgItemCodeSet));
        List<BgInspectItem> bgInspectItems = bgInspectItemMapper.selectByExample(bgItemExample);
        if (!CollectionUtils.isEmpty(bgInspectItems)) {
            Map<String, BgInspectItem> bgItemMap = bgInspectItems.stream().collect(Collectors.toMap(BgInspectItem::getBgItemCode, p -> p));
            for (InspectTaskItem taskItem : taskItems) {
                TaskItemVO taskItemVO = new TaskItemVO();
                BeanUtils.copyProperties(taskItem, taskItemVO);
                if (!bgItemMap.containsKey(taskItem.getBgItemCode())) {
                    continue;
                }
                BeanUtils.copyProperties(bgItemMap.get(taskItem.getBgItemCode()), taskItemVO);
                taskItemList.add(taskItemVO);
            }
        }
        long count = taskItemMapper.countByExample(example);

        pageBo.setItemList(taskItemList);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    public void updateTaskItem(TaskItemVO taskItemVO) {

        InspectTaskItemExample example = new InspectTaskItemExample();
        example.createCriteria().andTaskCodeEqualTo(taskItemVO.getItemCode());

        InspectTaskItem inspectTaskItem = new InspectTaskItem();
        BeanUtils.copyProperties(taskItemVO, inspectTaskItem);
        taskItemMapper.updateByExampleSelective(inspectTaskItem, example);
    }

    //todo 需要详细信息
    public TaskVO info(String taskCode) {
        TaskVO taskVO = new TaskVO();
        InspectTaskExample example = new InspectTaskExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode);
        List<InspectTask> taskList = taskMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(taskList)) {
            InspectTask inspectTask = taskList.get(0);
            BeanUtils.copyProperties(inspectTask, taskVO);
        }
        //todo
        return taskVO;
    }


    private InspectTaskExample buildTaskExample(TaskQuery taskQuery) {
        InspectTaskExample example = new InspectTaskExample();
        example.setLimitStart(taskQuery.getPageNo());
        example.setCount((taskQuery.getPageNo() - 1) * taskQuery.getPageSize());
        return example;
        /*
        if (StringUtils.isNotBlank(planQuery.getDeptName())) {
            InspectPlanDeptExample deptExample = new InspectPlanDeptExample();
            deptExample.createCriteria().andDeptNameLike(Constants.LIKE + planQuery.getDeptName() + Constants.LIKE);
            List<InspectPlanDept> inspectPlanDepts = inspectPlanDeptMapper.selectByExample(deptExample);
            Set<String> inspectPlanCodeSet = inspectPlanDepts.stream().map(InspectPlanDept::getInspcetPlanCode).collect(Collectors.toSet());
            criteria.andInspectPlanCodeIn(Lists.newArrayList(inspectPlanCodeSet));
        }*/

    }
}
