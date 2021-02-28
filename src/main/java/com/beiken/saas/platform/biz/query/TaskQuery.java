package com.beiken.saas.platform.biz.query;

import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午6:56
 */
@Data
public class TaskQuery extends BaseQuery implements Serializable{
    private static final long serialVersionUID = -5762736742607387827L;

    private Long inspectUserId;

    private String inspectUserName;


}
