package com.beiken.saas.platform.service.impl;

import com.beiken.saas.platform.dao.InspectionTaskDao;
import com.beiken.saas.platform.entity.InspectionTask;
import com.beiken.saas.platform.service.InspectionTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InspectionTask)表服务实现类
 *
 * @author xiaobeixin
 * @since 2020-11-21 11:15:11
 */
@Service
public class InspectionTaskServiceImpl implements InspectionTaskService {
    @Resource
    private InspectionTaskDao inspectionTaskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public InspectionTask queryById(Long id) {
        return this.inspectionTaskDao.queryById(id);
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
        return this.inspectionTaskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param inspectionTask 实例对象
     * @return 实例对象
     */
    @Override
    public InspectionTask insert(InspectionTask inspectionTask) {
        this.inspectionTaskDao.insert(inspectionTask);
        return inspectionTask;
    }

    /**
     * 修改数据
     *
     * @param inspectionTask 实例对象
     * @return 实例对象
     */
    @Override
    public InspectionTask update(InspectionTask inspectionTask) {
        this.inspectionTaskDao.update(inspectionTask);
        return this.queryById(inspectionTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.inspectionTaskDao.deleteById(id) > 0;
    }
}