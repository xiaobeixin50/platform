package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.HiddenDangerCheckDO;
import com.beiken.saas.platform.pojo.HiddenDangerCheckDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiddenDangerCheckMapper {
    long countByExample(HiddenDangerCheckDOExample example);

    int deleteByExample(HiddenDangerCheckDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiddenDangerCheckDO record);

    int insertSelective(HiddenDangerCheckDO record);

    List<HiddenDangerCheckDO> selectByExample(HiddenDangerCheckDOExample example);

    HiddenDangerCheckDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiddenDangerCheckDO record, @Param("example") HiddenDangerCheckDOExample example);

    int updateByExample(@Param("record") HiddenDangerCheckDO record, @Param("example") HiddenDangerCheckDOExample example);

    int updateByPrimaryKeySelective(HiddenDangerCheckDO record);

    int updateByPrimaryKey(HiddenDangerCheckDO record);
}