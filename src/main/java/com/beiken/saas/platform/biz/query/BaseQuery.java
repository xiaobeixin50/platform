package com.beiken.saas.platform.biz.query;

import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:57
 */
@Data
public abstract class BaseQuery implements Serializable{
    private static final long serialVersionUID = 8893305858779393137L;
    private Integer pageNo = 1;
    private Integer pageSize = 20;
}
