package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectTaskItem;
import com.beiken.saas.platform.pojo.InspectTaskItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectTaskItemMapper {
    long countByExample(InspectTaskItemExample example);

    int deleteByExample(InspectTaskItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectTaskItem record);

    int insertSelective(InspectTaskItem record);

    List<InspectTaskItem> selectByExample(InspectTaskItemExample example);

    InspectTaskItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectTaskItem record, @Param("example") InspectTaskItemExample example);

    int updateByExample(@Param("record") InspectTaskItem record, @Param("example") InspectTaskItemExample example);

    int updateByPrimaryKeySelective(InspectTaskItem record);

    int updateByPrimaryKey(InspectTaskItem record);
}