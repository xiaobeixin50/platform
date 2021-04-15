package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.UserMapper;
import com.beiken.saas.platform.pojo.DepartmentDO;
import com.beiken.saas.platform.pojo.DepartmentDOExample;
import com.beiken.saas.platform.pojo.UserDO;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/3/26
 * Time: 下午2:18
 */
@Component
public class DepartManager {
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private UserMapper userMapper;

    /**
     * 获取当前用户井队或管理的井队
     * @param userId
     * @return
     */
    public List<Long> getDeptAndParentIdByUserId(Long userId) {
        List<Long> result = Lists.newArrayList();
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        DepartmentDO departmentDO = departmentMapper.selectByPrimaryKey(userDO.getDepId());

        if (departmentDO.getLevel() < 2) {
            DepartmentDOExample example = new DepartmentDOExample();
            example.createCriteria().andParentIdEqualTo(departmentDO.getId());
            List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(example);
            Set<Long> collect = departmentDOs.stream().map(DepartmentDO::getId).collect(Collectors.toSet());
            result.addAll(collect);
        }
        result.add(departmentDO.getId());
        return result;
    }

    /**
     * 获取当前用户井队或管理的井队
     * @param userId
     * @return
     */
    public DepartmentDO getDeptByUserId(Long userId) {
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        if (userDO == null) {
            return null;
        }
        return departmentMapper.selectByPrimaryKey(userDO.getDepId());
    }



    public List<DepartmentDO> getDeptById(List<Long> deptIds) {
        if (CollectionUtils.isEmpty(deptIds)) {
            return Collections.emptyList();
        }
        DepartmentDOExample example = new DepartmentDOExample();
        example.createCriteria().andIdIn(deptIds);
        List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(example);
        return departmentDOs;
    }

    public DepartmentDO getParentByDeptId(Long deptId) {
        DepartmentDO departmentDO = departmentMapper.selectByPrimaryKey(deptId);
        if (departmentDO == null) {
            return null;
        }
        return departmentMapper.selectByPrimaryKey(departmentDO.getParentId());
    }

}
