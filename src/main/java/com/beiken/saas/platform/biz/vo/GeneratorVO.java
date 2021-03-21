package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/17
 * Time: 下午10:33
 */
@Data
public class GeneratorVO implements Serializable{
    private static final long serialVersionUID = 5270938978209013191L;

    private String code;

    private String text;

    private String value;
}
