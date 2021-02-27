package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectPlan;
import com.beiken.saas.platform.pojo.InspectPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectPlanMapper {
    long countByExample(InspectPlanExample example);

    int deleteByExample(InspectPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectPlan record);

    int insertSelective(InspectPlan record);

    List<InspectPlan> selectByExampleWithBLOBs(InspectPlanExample example);

    List<InspectPlan> selectByExample(InspectPlanExample example);

    InspectPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectPlan record, @Param("example") InspectPlanExample example);

    int updateByExampleWithBLOBs(@Param("record") InspectPlan record, @Param("example") InspectPlanExample example);

    int updateByExample(@Param("record") InspectPlan record, @Param("example") InspectPlanExample example);

    int updateByPrimaryKeySelective(InspectPlan record);

    int updateByPrimaryKeyWithBLOBs(InspectPlan record);

    int updateByPrimaryKey(InspectPlan record);
}