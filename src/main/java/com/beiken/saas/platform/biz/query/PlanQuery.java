package com.beiken.saas.platform.biz.query;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:48
 */
@Data
public class PlanQuery extends BaseQuery implements Serializable{
    private static final long serialVersionUID = -2573521085679425135L;

    private String planCode;

    private String planName;

    /**
     * 受检单位code
     */
    private String deptCode;

    private String deptName;

    /**
     * 检查类型
     */
    private String type;

    private Integer status;

    private Date startDate;

    private Date endDate;

}
