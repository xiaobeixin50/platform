package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.BgDO;
import com.beiken.saas.platform.pojo.BgDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgMapper {
    long countByExample(BgDOExample example);

    int deleteByExample(BgDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BgDO record);

    int insertSelective(BgDO record);

    List<BgDO> selectByExampleWithBLOBs(BgDOExample example);

    List<BgDO> selectByExample(BgDOExample example);

    BgDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BgDO record, @Param("example") BgDOExample example);

    int updateByExampleWithBLOBs(@Param("record") BgDO record, @Param("example") BgDOExample example);

    int updateByExample(@Param("record") BgDO record, @Param("example") BgDOExample example);

    int updateByPrimaryKeySelective(BgDO record);

    int updateByPrimaryKeyWithBLOBs(BgDO record);

    int updateByPrimaryKey(BgDO record);
}