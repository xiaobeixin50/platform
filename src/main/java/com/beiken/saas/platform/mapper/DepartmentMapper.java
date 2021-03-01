package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.DepartmentDO;
import com.beiken.saas.platform.pojo.DepartmentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    long countByExample(DepartmentDOExample example);

    int deleteByExample(DepartmentDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DepartmentDO record);

    int insertSelective(DepartmentDO record);

    List<DepartmentDO> selectByExample(DepartmentDOExample example);

    DepartmentDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DepartmentDO record, @Param("example") DepartmentDOExample example);

    int updateByExample(@Param("record") DepartmentDO record, @Param("example") DepartmentDOExample example);

    int updateByPrimaryKeySelective(DepartmentDO record);

    int updateByPrimaryKey(DepartmentDO record);
}