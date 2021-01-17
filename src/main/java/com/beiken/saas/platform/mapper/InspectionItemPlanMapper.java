package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionItemPlan;
import com.beiken.saas.platform.pojo.InspectionItemPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemPlanMapper {
    long countByExample(InspectionItemPlanExample example);

    int deleteByExample(InspectionItemPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionItemPlan record);

    int insertSelective(InspectionItemPlan record);

    List<InspectionItemPlan> selectByExample(InspectionItemPlanExample example);

    InspectionItemPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionItemPlan record, @Param("example") InspectionItemPlanExample example);

    int updateByExample(@Param("record") InspectionItemPlan record, @Param("example") InspectionItemPlanExample example);

    int updateByPrimaryKeySelective(InspectionItemPlan record);

    int updateByPrimaryKey(InspectionItemPlan record);
}