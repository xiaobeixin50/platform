package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum DangerStatusEnum {

    FINISH(0, "已解决"),

    WAIT_LEVEL(1, "待分级"),

    WAIT_ENV_PLAN(2, "待环保部门出方案"),

    WAIT_RESPON_PLAN(3, "待责任单位出方案"),

    WAIT_CHANGE(4, "待整改"),

    WAIT_ENV_ACCEPT(5, "待环保部门验收"),

    WIT_CONFIRM(10, "待确认");

    private Integer status;

    private String msg;

    public static final Map<Integer, DangerStatusEnum> MAP = Maps.newHashMap();

    static {
        for (DangerStatusEnum item : DangerStatusEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static DangerStatusEnum index(Integer status) {
        return status == null? null:MAP.get(status);
    }

    DangerStatusEnum(Integer status, String msg) {
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
