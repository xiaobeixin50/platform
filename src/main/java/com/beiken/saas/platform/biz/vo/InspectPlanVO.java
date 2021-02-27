package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.InspectPlan;
import lombok.Data;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午8:52
 */
@Data
public class InspectPlanVO extends InspectPlan {

    private String deptCode;

    private String deptName;

    private String deptParentCode;

    private String deptParentName;

    private Long itemNum;

}

