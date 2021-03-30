package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.SwitchDO;
import com.beiken.saas.platform.pojo.SwitchDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwitchMapper {
    long countByExample(SwitchDOExample example);

    int deleteByExample(SwitchDOExample example);

    int deleteByPrimaryKey(String name);

    int insert(SwitchDO record);

    int insertSelective(SwitchDO record);

    List<SwitchDO> selectByExample(SwitchDOExample example);

    SwitchDO selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SwitchDO record, @Param("example") SwitchDOExample example);

    int updateByExample(@Param("record") SwitchDO record, @Param("example") SwitchDOExample example);

    int updateByPrimaryKeySelective(SwitchDO record);

    int updateByPrimaryKey(SwitchDO record);
}