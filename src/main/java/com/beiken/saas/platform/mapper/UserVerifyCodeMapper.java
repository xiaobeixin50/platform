package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.UserVerifyCodeDO;
import com.beiken.saas.platform.pojo.UserVerifyCodeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVerifyCodeMapper {
    long countByExample(UserVerifyCodeDOExample example);

    int deleteByExample(UserVerifyCodeDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserVerifyCodeDO record);

    int insertSelective(UserVerifyCodeDO record);

    List<UserVerifyCodeDO> selectByExample(UserVerifyCodeDOExample example);

    UserVerifyCodeDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserVerifyCodeDO record, @Param("example") UserVerifyCodeDOExample example);

    int updateByExample(@Param("record") UserVerifyCodeDO record, @Param("example") UserVerifyCodeDOExample example);

    int updateByPrimaryKeySelective(UserVerifyCodeDO record);

    int updateByPrimaryKey(UserVerifyCodeDO record);
}