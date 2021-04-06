package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectDeptDO;
import com.beiken.saas.platform.pojo.InspectDeptDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectDeptMapper {
    long countByExample(InspectDeptDOExample example);

    int deleteByExample(InspectDeptDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectDeptDO record);

    int insertSelective(InspectDeptDO record);

    List<InspectDeptDO> selectByExample(InspectDeptDOExample example);

    InspectDeptDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectDeptDO record, @Param("example") InspectDeptDOExample example);

    int updateByExample(@Param("record") InspectDeptDO record, @Param("example") InspectDeptDOExample example);

    int updateByPrimaryKeySelective(InspectDeptDO record);

    int updateByPrimaryKey(InspectDeptDO record);
}