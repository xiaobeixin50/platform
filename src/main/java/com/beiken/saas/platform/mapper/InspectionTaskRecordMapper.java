package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionTaskRecord;
import com.beiken.saas.platform.pojo.InspectionTaskRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionTaskRecordMapper {
    long countByExample(InspectionTaskRecordExample example);

    int deleteByExample(InspectionTaskRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionTaskRecord record);

    int insertSelective(InspectionTaskRecord record);

    List<InspectionTaskRecord> selectByExample(InspectionTaskRecordExample example);

    InspectionTaskRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionTaskRecord record, @Param("example") InspectionTaskRecordExample example);

    int updateByExample(@Param("record") InspectionTaskRecord record, @Param("example") InspectionTaskRecordExample example);

    int updateByPrimaryKeySelective(InspectionTaskRecord record);

    int updateByPrimaryKey(InspectionTaskRecord record);
}