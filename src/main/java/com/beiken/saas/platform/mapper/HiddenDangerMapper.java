package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.HiddenDanger;
import com.beiken.saas.platform.pojo.HiddenDangerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiddenDangerMapper {
    long countByExample(HiddenDangerExample example);

    int deleteByExample(HiddenDangerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiddenDanger record);

    int insertSelective(HiddenDanger record);

    List<HiddenDanger> selectByExample(HiddenDangerExample example);

    HiddenDanger selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiddenDanger record, @Param("example") HiddenDangerExample example);

    int updateByExample(@Param("record") HiddenDanger record, @Param("example") HiddenDangerExample example);

    int updateByPrimaryKeySelective(HiddenDanger record);

    int updateByPrimaryKey(HiddenDanger record);
}