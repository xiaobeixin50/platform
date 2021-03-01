package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.HiddenDangerDO;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiddenDangerMapper {
    long countByExample(HiddenDangerDOExample example);

    int deleteByExample(HiddenDangerDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiddenDangerDO record);

    int insertSelective(HiddenDangerDO record);

    List<HiddenDangerDO> selectByExampleWithBLOBs(HiddenDangerDOExample example);

    List<HiddenDangerDO> selectByExample(HiddenDangerDOExample example);

    HiddenDangerDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiddenDangerDO record, @Param("example") HiddenDangerDOExample example);

    int updateByExampleWithBLOBs(@Param("record") HiddenDangerDO record, @Param("example") HiddenDangerDOExample example);

    int updateByExample(@Param("record") HiddenDangerDO record, @Param("example") HiddenDangerDOExample example);

    int updateByPrimaryKeySelective(HiddenDangerDO record);

    int updateByPrimaryKeyWithBLOBs(HiddenDangerDO record);

    int updateByPrimaryKey(HiddenDangerDO record);
}