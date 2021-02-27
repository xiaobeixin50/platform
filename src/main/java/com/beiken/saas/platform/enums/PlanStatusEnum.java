package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum PlanStatusEnum {

    OPEN(1, "启用中"),

    STOP(0, "已停用");

    private Integer status;

    private String msg;

    private static final Map<Integer, PlanStatusEnum> MAP = Maps.newHashMap();

    static {
        for (PlanStatusEnum item : PlanStatusEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static PlanStatusEnum index(Integer status) {
        return status == null? null:MAP.get(status);
    }

    PlanStatusEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
