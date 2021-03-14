package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/14
 * Time: 上午10:07
 */
@Data
public class RigVO implements Serializable{

    private static final long serialVersionUID = -6196794778468323535L;

    @ApiModelProperty(name = "id", value = "钻井主键id")
    private Long id;

    @ApiModelProperty(name = "rigCode", value = "钻井编号")
    private String rigCode;

    @ApiModelProperty(name = "status", value = "钻井状态,0-未开始,1-进行中,2-已结束")
    private String status;
}
