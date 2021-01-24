package com.beiken.saas.platform.service.impl;

import com.beiken.saas.platform.biz.vo.TaskRecordVO;
import com.beiken.saas.platform.dao.InspectionTaskDao;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.InspectionItemMapper;
import com.beiken.saas.platform.mapper.InspectionTaskMapper;
import com.beiken.saas.platform.pojo.*;
import com.beiken.saas.platform.service.InspectionTaskService;
import io.swagger.models.auth.In;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static java.util.stream.Collectors.groupingBy;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * (InspectionTask)表服务实现类
 *
 * @author xiaobeixin
 * @since 2020-11-21 11:15:11
 */
@Service
public class InspectionTaskServiceImpl implements InspectionTaskService {
//    @Resource
//    private InspectionTaskDao inspectionTaskDao;

    @Resource
    private InspectionTaskMapper inspectionTaskMapper;


    @Resource
    private InspectionItemMapper inspectionItemMapper;

    @Resource
    private HiddenDangerMapper hiddenDangerMapper;

    @Override
    public List<TaskRecordVO> getTask(Long empId) {


        InspectionTaskExample example = new InspectionTaskExample();
        example.createCriteria().andEmpIdEqualTo(empId);
        example.setOrderByClause("demand_time desc");
        List<InspectionTask> inspectionTasks = inspectionTaskMapper.selectByExample(example);
        Map<Long, List<InspectionTask>> taskMap = inspectionTasks.stream().collect(groupingBy(InspectionTask::getId));

        List<Long> taskIds = inspectionTasks.stream().map(InspectionTask::getId).collect(Collectors.toList());

        InspectionItemExample itemExample = new InspectionItemExample();
        itemExample.createCriteria().andTaskIdIn(taskIds);
        List<InspectionItem> inspectionItems = inspectionItemMapper.selectByExample(itemExample);

        HiddenDangerExample hiddenDangerExample = new HiddenDangerExample();
        hiddenDangerExample.createCriteria().andTaskIdIn(taskIds);
        List<HiddenDanger> hiddenDangers = hiddenDangerMapper.selectByExample(hiddenDangerExample);

        Map<Long, List<HiddenDanger>> dangerMap = hiddenDangers.stream().collect(groupingBy(HiddenDanger::getTaskId));

        List<TaskRecordVO> result = new ArrayList<>();
        Map<Long, List<InspectionItem>> collect =
                inspectionItems.stream().collect(groupingBy(InspectionItem::getTaskId));
        for (Long taskId : taskMap.keySet()) {
            InspectionTask task = taskMap.get(taskId).get(0);
            List<InspectionItem> itemList = collect.get(taskId);
            List<HiddenDanger> dangerList = dangerMap.get(taskId);


            TaskRecordVO taskVo = new TaskRecordVO();
            BeanCopier copier = BeanCopier.create(task.getClass(), taskVo.getClass(), false);
            copier.copy(task, taskVo, null);
            long finishCount = itemList.stream().filter(item -> {
                return !StringUtils.isEmpty(item.getFeedbackResult());

            }).count();
            int itemCount = itemList.size();
            taskVo.setItemCount(itemCount);
            taskVo.setRiskCount(dangerList != null ? dangerList.size() : 0);
            taskVo.setProcess((int) finishCount * 100 / itemList.size());

            result.add(taskVo);
        }
        return result;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public InspectionTask queryById(Long id) {

//        return this.inspectionTaskDao.queryById(id);
        return null;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<InspectionTask> queryAllByLimit(int offset, int limit) {
//        return this.inspectionTaskDao.queryAllByLimit(offset, limit);
        return null;
    }

    /**
     * 新增数据
     *
     * @param inspectionTask 实例对象
     * @return 实例对象
     */
    @Override
    public InspectionTask insert(InspectionTask inspectionTask) {
//        this.inspectionTaskDao.insert(inspectionTask);
//        return inspectionTask;
        return null;
    }

    /**
     * 修改数据
     *
     * @param inspectionTask 实例对象
     * @return 实例对象
     */
    @Override
    public InspectionTask update(InspectionTask inspectionTask) {
//        this.inspectionTaskDao.update(inspectionTask);
//        return this.queryById(inspectionTask.getId());
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
//        return this.inspectionTaskDao.deleteById(id) > 0;
        return inspectionTaskMapper.deleteByPrimaryKey(id) > 0;
    }
}