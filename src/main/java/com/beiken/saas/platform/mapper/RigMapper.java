package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.Rig;
import com.beiken.saas.platform.pojo.RigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RigMapper {
    long countByExample(RigExample example);

    int deleteByExample(RigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Rig record);

    int insertSelective(Rig record);

    List<Rig> selectByExampleWithBLOBs(RigExample example);

    List<Rig> selectByExample(RigExample example);

    Rig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Rig record, @Param("example") RigExample example);

    int updateByExampleWithBLOBs(@Param("record") Rig record, @Param("example") RigExample example);

    int updateByExample(@Param("record") Rig record, @Param("example") RigExample example);

    int updateByPrimaryKeySelective(Rig record);

    int updateByPrimaryKeyWithBLOBs(Rig record);

    int updateByPrimaryKey(Rig record);
}