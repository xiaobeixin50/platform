package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.mapper.UserMapper;
import com.beiken.saas.platform.pojo.UserDO;
import com.beiken.saas.platform.pojo.UserDOExample;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * User: panboliang
 * Date: 21/3/29
 * Time: 下午4:38
 */
@Component
public class UserManager {

    @Resource
    private UserMapper userMapper;

    public List<UserDO> getUserById(List<Long> userIds) {
        if (CollectionUtils.isEmpty(userIds)) {
            return Collections.emptyList();
        }
        UserDOExample example = new UserDOExample();
        example.createCriteria().andIdIn(userIds);
        List<UserDO> userDOs = userMapper.selectByExample(example);
        return userDOs;
    }

    public UserDO getUserById(Long userId) {
        if (Objects.isNull(userId)) {
            return null;
        }
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        return userDO;
    }
}
