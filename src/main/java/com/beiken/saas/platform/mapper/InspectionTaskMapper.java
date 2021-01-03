package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionTask;
import com.beiken.saas.platform.pojo.InspectionTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionTaskMapper {
    long countByExample(InspectionTaskExample example);

    int deleteByExample(InspectionTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionTask record);

    int insertSelective(InspectionTask record);

    List<InspectionTask> selectByExample(InspectionTaskExample example);

    InspectionTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionTask record, @Param("example") InspectionTaskExample example);

    int updateByExample(@Param("record") InspectionTask record, @Param("example") InspectionTaskExample example);

    int updateByPrimaryKeySelective(InspectionTask record);

    int updateByPrimaryKey(InspectionTask record);
}