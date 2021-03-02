package com.beiken.saas.platform.biz.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午8:17
 */
@Data
public class DangerQuery implements Serializable{
    private static final long serialVersionUID = 8895826397920513204L;

    @ApiModelProperty(name = "dangerLevel", value = "隐患级别"
            , required = false, example = "")
    private String dangerLevel;

    @ApiModelProperty(name = "resultStatus", value = "隐患状态"
            , required = false, example = "")
    private String resultStatus;

    @ApiModelProperty(name = "sort", value = "排序规则"
            , required = false, example = "AES/DESC")
    private String sort;

}
