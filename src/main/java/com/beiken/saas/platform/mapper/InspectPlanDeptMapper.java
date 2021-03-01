package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectPlanDeptDO;
import com.beiken.saas.platform.pojo.InspectPlanDeptDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectPlanDeptMapper {
    long countByExample(InspectPlanDeptDOExample example);

    int deleteByExample(InspectPlanDeptDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectPlanDeptDO record);

    int insertSelective(InspectPlanDeptDO record);

    List<InspectPlanDeptDO> selectByExample(InspectPlanDeptDOExample example);

    InspectPlanDeptDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectPlanDeptDO record, @Param("example") InspectPlanDeptDOExample example);

    int updateByExample(@Param("record") InspectPlanDeptDO record, @Param("example") InspectPlanDeptDOExample example);

    int updateByPrimaryKeySelective(InspectPlanDeptDO record);

    int updateByPrimaryKey(InspectPlanDeptDO record);
}