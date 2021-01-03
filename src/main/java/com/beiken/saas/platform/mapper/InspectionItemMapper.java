package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.InspectionItem;
import com.beiken.saas.platform.pojo.InspectionItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemMapper {
    long countByExample(InspectionItemExample example);

    int deleteByExample(InspectionItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionItem record);

    int insertSelective(InspectionItem record);

    List<InspectionItem> selectByExample(InspectionItemExample example);

    InspectionItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionItem record, @Param("example") InspectionItemExample example);

    int updateByExample(@Param("record") InspectionItem record, @Param("example") InspectionItemExample example);

    int updateByPrimaryKeySelective(InspectionItem record);

    int updateByPrimaryKey(InspectionItem record);
}