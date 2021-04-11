package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.EnvDO;
import com.beiken.saas.platform.pojo.EnvDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnvMapper {
    long countByExample(EnvDOExample example);

    int deleteByExample(EnvDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EnvDO record);

    int insertSelective(EnvDO record);

    List<EnvDO> selectByExample(EnvDOExample example);

    EnvDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EnvDO record, @Param("example") EnvDOExample example);

    int updateByExample(@Param("record") EnvDO record, @Param("example") EnvDOExample example);

    int updateByPrimaryKeySelective(EnvDO record);

    int updateByPrimaryKey(EnvDO record);
}