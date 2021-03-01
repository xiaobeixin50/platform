package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.BgInspectItemDO;
import com.beiken.saas.platform.pojo.BgInspectItemDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgInspectItemMapper {
    long countByExample(BgInspectItemDOExample example);

    int deleteByExample(BgInspectItemDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BgInspectItemDO record);

    int insertSelective(BgInspectItemDO record);

    List<BgInspectItemDO> selectByExampleWithBLOBs(BgInspectItemDOExample example);

    List<BgInspectItemDO> selectByExample(BgInspectItemDOExample example);

    BgInspectItemDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BgInspectItemDO record, @Param("example") BgInspectItemDOExample example);

    int updateByExampleWithBLOBs(@Param("record") BgInspectItemDO record, @Param("example") BgInspectItemDOExample example);

    int updateByExample(@Param("record") BgInspectItemDO record, @Param("example") BgInspectItemDOExample example);

    int updateByPrimaryKeySelective(BgInspectItemDO record);

    int updateByPrimaryKeyWithBLOBs(BgInspectItemDO record);

    int updateByPrimaryKey(BgInspectItemDO record);
}