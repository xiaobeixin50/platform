package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.RigMapper;
import com.beiken.saas.platform.pojo.RigDO;
import com.beiken.saas.platform.pojo.RigDOExample;
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

    public List<String> getRigByUserId(List<Long> deptIds) {
        RigDOExample example = new RigDOExample();
        example.createCriteria().andDeptIdIn(deptIds);
        List<RigDO> rigDOList = rigMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(rigDOList)) {
            Collections.emptyList();
        }
        return rigDOList.stream().map(RigDO::getRigCode).collect(Collectors.toList());
    }
}
