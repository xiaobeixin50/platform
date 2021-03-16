package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/16
 * Time: 下午11:02
 */
@Data
public class SelfVO implements Serializable{
    private static final long serialVersionUID = -41142009037194524L;

    @ApiModelProperty(name = "dangerNum", value = "上传隐患数"
            , example = "52")
    private Long dangerNum;

    @ApiModelProperty(name = "afterTimeTask", value = "过期任务数"
            , example = "4")
    private Long afterTimeTask;
}
