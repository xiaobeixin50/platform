package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionStopcard;
import com.beiken.saas.platform.pojo.InspectionStopcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionStopcardMapper {
    long countByExample(InspectionStopcardExample example);

    int deleteByExample(InspectionStopcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionStopcard record);

    int insertSelective(InspectionStopcard record);

    List<InspectionStopcard> selectByExample(InspectionStopcardExample example);

    InspectionStopcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionStopcard record, @Param("example") InspectionStopcardExample example);

    int updateByExample(@Param("record") InspectionStopcard record, @Param("example") InspectionStopcardExample example);

    int updateByPrimaryKeySelective(InspectionStopcard record);

    int updateByPrimaryKey(InspectionStopcard record);
}