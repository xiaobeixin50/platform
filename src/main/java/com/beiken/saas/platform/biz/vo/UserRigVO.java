package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/3/9
 * Time: 下午7:33
 */
@Data
public class UserRigVO implements Serializable{
    private static final long serialVersionUID = -1311539889144135203L;

    @ApiModelProperty(name = "userId", value = "用户id")
    private Long userId;

    @ApiModelProperty(name = "taskTitleMap", value = "所属井队和子公司以及下面的井")
    private Map<DeptVO, List<RigVO>> taskTitleMap;

}
