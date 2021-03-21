package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/18
 * Time: 下午8:08
 */
@Data
public class RankVO implements Serializable{
    private static final long serialVersionUID = 2291084988736168657L;

    private Long rankNo;

    private UserVO userVO;

    private Long manageRigNum;

    private Long dangerNum;
}
