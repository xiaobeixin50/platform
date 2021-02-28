package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.TaskQuery;
import com.beiken.saas.platform.biz.vo.TaskVO;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.InspectTask;
import com.beiken.saas.platform.pojo.InspectTaskExample;
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
    private InspectPlanManager inspectPlanManager;

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
