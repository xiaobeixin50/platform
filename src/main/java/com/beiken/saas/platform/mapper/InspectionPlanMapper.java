package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionPlan;
import com.beiken.saas.platform.pojo.InspectionPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionPlanMapper {
    long countByExample(InspectionPlanExample example);

    int deleteByExample(InspectionPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionPlan record);

    int insertSelective(InspectionPlan record);

    List<InspectionPlan> selectByExample(InspectionPlanExample example);

    InspectionPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionPlan record, @Param("example") InspectionPlanExample example);

    int updateByExample(@Param("record") InspectionPlan record, @Param("example") InspectionPlanExample example);

    int updateByPrimaryKeySelective(InspectionPlan record);

    int updateByPrimaryKey(InspectionPlan record);
}