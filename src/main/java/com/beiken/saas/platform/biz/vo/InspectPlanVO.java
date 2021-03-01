package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.Department;
import com.beiken.saas.platform.pojo.InspectPlanDO;
import com.beiken.saas.platform.pojo.User;
import lombok.Data;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午8:52
 */
@Data
public class InspectPlanVO extends InspectPlanDO {

    /**
     * 受检单位,key->deptCode
     */
    private Map<String, Department> deptInfoMap;

    /**
     * 受检单位上级单位,key->deptCode
     */
    private Map<String, Department> deptParentInfoMap;

    private Long itemNum;

    private Map<Long, User> inspectUserMap;
}

