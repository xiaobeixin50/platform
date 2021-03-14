package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.RigDO;
import com.beiken.saas.platform.pojo.RigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RigMapper {
    long countByExample(RigDOExample example);

    int deleteByExample(RigDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RigDO record);

    int insertSelective(RigDO record);

    List<RigDO> selectByExampleWithBLOBs(RigDOExample example);

    List<RigDO> selectByExample(RigDOExample example);

    RigDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RigDO record, @Param("example") RigDOExample example);

    int updateByExampleWithBLOBs(@Param("record") RigDO record, @Param("example") RigDOExample example);

    int updateByExample(@Param("record") RigDO record, @Param("example") RigDOExample example);

    int updateByPrimaryKeySelective(RigDO record);

    int updateByPrimaryKeyWithBLOBs(RigDO record);

    int updateByPrimaryKey(RigDO record);
}