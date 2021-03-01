package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectTaskDO;
import com.beiken.saas.platform.pojo.InspectTaskDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectTaskMapper {
    long countByExample(InspectTaskDOExample example);

    int deleteByExample(InspectTaskDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectTaskDO record);

    int insertSelective(InspectTaskDO record);

    List<InspectTaskDO> selectByExample(InspectTaskDOExample example);

    InspectTaskDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectTaskDO record, @Param("example") InspectTaskDOExample example);

    int updateByExample(@Param("record") InspectTaskDO record, @Param("example") InspectTaskDOExample example);

    int updateByPrimaryKeySelective(InspectTaskDO record);

    int updateByPrimaryKey(InspectTaskDO record);
}