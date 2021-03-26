package com.beiken.saas.platform.mapper;

import com.beiken.saas.platform.pojo.TaskUserDO;
import com.beiken.saas.platform.pojo.TaskUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskUserMapper {
    long countByExample(TaskUserDOExample example);

    int deleteByExample(TaskUserDOExample example);

    int insert(TaskUserDO record);

    int insertSelective(TaskUserDO record);

    List<TaskUserDO> selectByExample(TaskUserDOExample example);

    int updateByExampleSelective(@Param("record") TaskUserDO record, @Param("example") TaskUserDOExample example);

    int updateByExample(@Param("record") TaskUserDO record, @Param("example") TaskUserDOExample example);
}