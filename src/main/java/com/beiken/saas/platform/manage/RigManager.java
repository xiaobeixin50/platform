package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.enums.RigStatusEnum;
import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.RigMapper;
import com.beiken.saas.platform.pojo.RigDO;
import com.beiken.saas.platform.pojo.RigDOExample;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/3/26
 * Time: 下午2:16
 */
@Component
public class RigManager {

    @Resource
    private RigMapper rigMapper;
    @Resource
    private DepartmentMapper departmentMapper;

    public List<String> getRigByDeptIds(List<Long> deptIds) {
        RigDOExample example = new RigDOExample();
        example.setOrderByClause("status asc");
        example.createCriteria().andDeptIdIn(deptIds)
                .andStatusIn(Lists.newArrayList(RigStatusEnum.BEGIN.getStatus(), RigStatusEnum.FINISH.getStatus()));
        List<RigDO> rigDOList = rigMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(rigDOList)) {
            Collections.emptyList();
        }
        return rigDOList.stream().map(RigDO::getRigCode).collect(Collectors.toList());
    }

    public List<RigDO> getRigDOByDeptId(Long deptId) {
        RigDOExample example = new RigDOExample();
        example.createCriteria().andDeptIdEqualTo(deptId).andStatusEqualTo(RigStatusEnum.BEGIN.getStatus());
        List<RigDO> rigDOList = rigMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(rigDOList)) {
            Collections.emptyList();
        }
        return rigDOList;
    }
}
