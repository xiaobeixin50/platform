package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.Bg;
import com.beiken.saas.platform.pojo.BgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgMapper {
    long countByExample(BgExample example);

    int deleteByExample(BgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bg record);

    int insertSelective(Bg record);

    List<Bg> selectByExampleWithBLOBs(BgExample example);

    List<Bg> selectByExample(BgExample example);

    Bg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bg record, @Param("example") BgExample example);

    int updateByExampleWithBLOBs(@Param("record") Bg record, @Param("example") BgExample example);

    int updateByExample(@Param("record") Bg record, @Param("example") BgExample example);

    int updateByPrimaryKeySelective(Bg record);

    int updateByPrimaryKeyWithBLOBs(Bg record);

    int updateByPrimaryKey(Bg record);
}