package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionItemRecord;
import com.beiken.saas.platform.pojo.InspectionItemRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemRecordMapper {
    long countByExample(InspectionItemRecordExample example);

    int deleteByExample(InspectionItemRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionItemRecord record);

    int insertSelective(InspectionItemRecord record);

    List<InspectionItemRecord> selectByExample(InspectionItemRecordExample example);

    InspectionItemRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionItemRecord record, @Param("example") InspectionItemRecordExample example);

    int updateByExample(@Param("record") InspectionItemRecord record, @Param("example") InspectionItemRecordExample example);

    int updateByPrimaryKeySelective(InspectionItemRecord record);

    int updateByPrimaryKey(InspectionItemRecord record);
}