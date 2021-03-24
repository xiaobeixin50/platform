package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/17
 * Time: 下午11:19
 */
@Data
public class EquipmentVO implements Serializable{
    private static final long serialVersionUID = -3649126797967217067L;

    private String value;

    private String bgItemCode;

    private List<EquipmentVO> voList;
}
