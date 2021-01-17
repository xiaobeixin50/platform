package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.MineProject;
import com.beiken.saas.platform.pojo.MineProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MineProjectMapper {
    long countByExample(MineProjectExample example);

    int deleteByExample(MineProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MineProject record);

    int insertSelective(MineProject record);

    List<MineProject> selectByExample(MineProjectExample example);

    MineProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MineProject record, @Param("example") MineProjectExample example);

    int updateByExample(@Param("record") MineProject record, @Param("example") MineProjectExample example);

    int updateByPrimaryKeySelective(MineProject record);

    int updateByPrimaryKey(MineProject record);
}