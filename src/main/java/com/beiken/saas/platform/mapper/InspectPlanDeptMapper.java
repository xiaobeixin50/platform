package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectPlanDept;
import com.beiken.saas.platform.pojo.InspectPlanDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectPlanDeptMapper {
    long countByExample(InspectPlanDeptExample example);

    int deleteByExample(InspectPlanDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectPlanDept record);

    int insertSelective(InspectPlanDept record);

    List<InspectPlanDept> selectByExample(InspectPlanDeptExample example);

    InspectPlanDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectPlanDept record, @Param("example") InspectPlanDeptExample example);

    int updateByExample(@Param("record") InspectPlanDept record, @Param("example") InspectPlanDeptExample example);

    int updateByPrimaryKeySelective(InspectPlanDept record);

    int updateByPrimaryKey(InspectPlanDept record);
}