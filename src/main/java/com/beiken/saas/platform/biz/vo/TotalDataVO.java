package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/3/20
 * Time: 下午4:53
 */
@Data
public class TotalDataVO implements Serializable{
    private static final long serialVersionUID = -6175448298764078098L;

    private Long dangerNum;

    private Long finishDangerNum;

    private Long taskNum;

    private Long limitTimeNum;

    private Map<String, Double> valueMap;

}
