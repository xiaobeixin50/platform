package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectTask;
import com.beiken.saas.platform.pojo.InspectTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectTaskMapper {
    long countByExample(InspectTaskExample example);

    int deleteByExample(InspectTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectTask record);

    int insertSelective(InspectTask record);

    List<InspectTask> selectByExample(InspectTaskExample example);

    InspectTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectTask record, @Param("example") InspectTaskExample example);

    int updateByExample(@Param("record") InspectTask record, @Param("example") InspectTaskExample example);

    int updateByPrimaryKeySelective(InspectTask record);

    int updateByPrimaryKey(InspectTask record);
}