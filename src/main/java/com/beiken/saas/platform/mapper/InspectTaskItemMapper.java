package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectTaskItemDO;
import com.beiken.saas.platform.pojo.InspectTaskItemDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectTaskItemMapper {
    long countByExample(InspectTaskItemDOExample example);

    int deleteByExample(InspectTaskItemDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectTaskItemDO record);

    int insertSelective(InspectTaskItemDO record);

    List<InspectTaskItemDO> selectByExample(InspectTaskItemDOExample example);

    InspectTaskItemDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectTaskItemDO record, @Param("example") InspectTaskItemDOExample example);

    int updateByExample(@Param("record") InspectTaskItemDO record, @Param("example") InspectTaskItemDOExample example);

    int updateByPrimaryKeySelective(InspectTaskItemDO record);

    int updateByPrimaryKey(InspectTaskItemDO record);
}