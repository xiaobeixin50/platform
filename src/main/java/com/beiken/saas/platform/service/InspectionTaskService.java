package com.beiken.saas.platform.service;

import com.beiken.saas.platform.entity.InspectionTask;

import java.util.List;

/**
 * (InspectionTask)表服务接口
 *
 * @author xiaobeixin
 * @since 2020-11-21 11:15:10
 */
public interface InspectionTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InspectionTask queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InspectionTask> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param inspectionTask 实例对象
     * @return 实例对象
     */
    InspectionTask insert(InspectionTask inspectionTask);

    /**
     * 修改数据
     *
     * @param inspectionTask 实例对象
     * @return 实例对象
     */
    InspectionTask update(InspectionTask inspectionTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}