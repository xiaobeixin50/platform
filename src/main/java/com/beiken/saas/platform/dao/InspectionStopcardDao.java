package com.beiken.saas.platform.dao;

import com.beiken.saas.platform.entity.InspectionStopcard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (InspectionStopcard)表数据库访问层
 *
 * @author xiaobeixin
 * @since 2020-11-22 13:12:12
 */
public interface InspectionStopcardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InspectionStopcard queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InspectionStopcard> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param inspectionStopcard 实例对象
     * @return 对象列表
     */
    List<InspectionStopcard> queryAll(InspectionStopcard inspectionStopcard);

    /**
     * 新增数据
     *
     * @param inspectionStopcard 实例对象
     * @return 影响行数
     */
    int insert(InspectionStopcard inspectionStopcard);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<InspectionStopcard> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<InspectionStopcard> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<InspectionStopcard> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<InspectionStopcard> entities);

    /**
     * 修改数据
     *
     * @param inspectionStopcard 实例对象
     * @return 影响行数
     */
    int update(InspectionStopcard inspectionStopcard);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}