package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.pojo.DepartmentDO;
import com.beiken.saas.platform.pojo.DepartmentDOExample;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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

    /**
     * 获取当前用户井队或管理的井队
     * @param userId
     * @return
     */
    public List<Long> getDeptIdByUserId(Long userId) {
        List<Long> result = Lists.newArrayList();
        DepartmentDO departmentDO = departmentMapper.selectByPrimaryKey(userId);
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
}
