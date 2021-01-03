package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.ExternalInspection;
import com.beiken.saas.platform.pojo.ExternalInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalInspectionMapper {
    long countByExample(ExternalInspectionExample example);

    int deleteByExample(ExternalInspectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExternalInspection record);

    int insertSelective(ExternalInspection record);

    List<ExternalInspection> selectByExample(ExternalInspectionExample example);

    ExternalInspection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExternalInspection record, @Param("example") ExternalInspectionExample example);

    int updateByExample(@Param("record") ExternalInspection record, @Param("example") ExternalInspectionExample example);

    int updateByPrimaryKeySelective(ExternalInspection record);

    int updateByPrimaryKey(ExternalInspection record);
}