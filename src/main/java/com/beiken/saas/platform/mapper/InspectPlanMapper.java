package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectPlanDO;
import com.beiken.saas.platform.pojo.InspectPlanDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectPlanMapper {
    long countByExample(InspectPlanDOExample example);

    int deleteByExample(InspectPlanDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectPlanDO record);

    int insertSelective(InspectPlanDO record);

    List<InspectPlanDO> selectByExampleWithBLOBs(InspectPlanDOExample example);

    List<InspectPlanDO> selectByExample(InspectPlanDOExample example);

    InspectPlanDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectPlanDO record, @Param("example") InspectPlanDOExample example);

    int updateByExampleWithBLOBs(@Param("record") InspectPlanDO record, @Param("example") InspectPlanDOExample example);

    int updateByExample(@Param("record") InspectPlanDO record, @Param("example") InspectPlanDOExample example);

    int updateByPrimaryKeySelective(InspectPlanDO record);

    int updateByPrimaryKeyWithBLOBs(InspectPlanDO record);

    int updateByPrimaryKey(InspectPlanDO record);
}