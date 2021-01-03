package com.beiken.saas.platform.service;

import com.beiken.saas.platform.entity.InspectionStopcard;

import java.util.List;

/**
 * (InspectionStopcard)表服务接口
 *
 * @author xiaobeixin
 * @since 2020-11-22 13:12:12
 */
@Deprecated
public interface InspectionStopcardService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InspectionStopcard queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InspectionStopcard> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param inspectionStopcard 实例对象
     * @return 实例对象
     */
    InspectionStopcard insert(InspectionStopcard inspectionStopcard);

    /**
     * 修改数据
     *
     * @param inspectionStopcard 实例对象
     * @return 实例对象
     */
    InspectionStopcard update(InspectionStopcard inspectionStopcard);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}