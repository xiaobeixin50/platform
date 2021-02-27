package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.BgInspectItem;
import com.beiken.saas.platform.pojo.BgInspectItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgInspectItemMapper {
    long countByExample(BgInspectItemExample example);

    int deleteByExample(BgInspectItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BgInspectItem record);

    int insertSelective(BgInspectItem record);

    List<BgInspectItem> selectByExampleWithBLOBs(BgInspectItemExample example);

    List<BgInspectItem> selectByExample(BgInspectItemExample example);

    BgInspectItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BgInspectItem record, @Param("example") BgInspectItemExample example);

    int updateByExampleWithBLOBs(@Param("record") BgInspectItem record, @Param("example") BgInspectItemExample example);

    int updateByExample(@Param("record") BgInspectItem record, @Param("example") BgInspectItemExample example);

    int updateByPrimaryKeySelective(BgInspectItem record);

    int updateByPrimaryKeyWithBLOBs(BgInspectItem record);

    int updateByPrimaryKey(BgInspectItem record);
}