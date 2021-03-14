package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/9
 * Time: 下午7:34
 */
@Data
public class DeptVO implements Serializable{
    private static final long serialVersionUID = -1145600506027368719L;

    @ApiModelProperty(name = "deptId", value = "井队/子公司id,所有有传参的地儿都用这个id")
    private Long deptId;

    @ApiModelProperty(name = "deptName", value = "井队/子公司")
    private String deptName;

    @ApiModelProperty(name = "deptType", value = "井队/子公司")
    private String deptType;
}
