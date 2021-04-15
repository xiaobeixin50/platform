package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.mapper.InspectDeptMapper;
import com.beiken.saas.platform.pojo.InspectDeptDO;
import com.beiken.saas.platform.pojo.InspectDeptDOExample;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/4/16
 * Time: 上午1:40
 */
@Component
public class InspectDeptManager {

    @Resource
    private InspectDeptMapper inspectDeptMapper;


    public List<Long> getDeptByInsepctUser(Long inspectUserId) {
        InspectDeptDOExample example = new InspectDeptDOExample();
        example.createCriteria().andInspectUserIdEqualTo(inspectUserId);
        List<InspectDeptDO> inspectDeptDOS = inspectDeptMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(inspectDeptDOS)) {
            return Collections.emptyList();
        }
        List<Long> collect = inspectDeptDOS.stream().map(InspectDeptDO::getDeptId).collect(Collectors.toList());
        return collect;
    }

}
