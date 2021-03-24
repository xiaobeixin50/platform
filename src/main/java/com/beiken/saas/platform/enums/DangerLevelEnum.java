package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum DangerLevelEnum {

    ONE_DANGER(0, "一级隐患"),
    TWO_DANGER(1, "二级隐患"),
    THREE_DANGER(2,"三级隐患"),
    FOUR_DANGER(3,"四级隐患");

    private Integer status;

    private String msg;

    public static final Map<Integer, DangerLevelEnum> MAP = Maps.newLinkedHashMap();

    static {
        for (DangerLevelEnum item : DangerLevelEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static DangerLevelEnum index(Integer status) {
        return status == null? null:MAP.get(status);
    }

    DangerLevelEnum(Integer status, String msg) {
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
