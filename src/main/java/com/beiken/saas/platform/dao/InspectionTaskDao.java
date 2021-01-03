package com.beiken.saas.platform.dao;

import com.beiken.saas.platform.entity.InspectionTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (InspectionTask)表数据库访问层
 *
 * @author xiaobeixin
 * @since 2020-11-21 11:15:08
 */
public interface InspectionTaskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InspectionTask queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InspectionTask> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param inspectionTask 实例对象
     * @return 对象列表
     */
    List<InspectionTask> queryAll(InspectionTask inspectionTask);

    /**
     * 新增数据
     *
     * @param inspectionTask 实例对象
     * @return 影响行数
     */
    int insert(InspectionTask inspectionTask);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<InspectionTask> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<InspectionTask> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<InspectionTask> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<InspectionTask> entities);

    /**
     * 修改数据
     *
     * @param inspectionTask 实例对象
     * @return 影响行数
     */
    int update(InspectionTask inspectionTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}