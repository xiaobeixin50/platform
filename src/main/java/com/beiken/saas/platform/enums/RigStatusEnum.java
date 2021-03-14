package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum RigStatusEnum {

    NOT_BEGIN(0, "已停用"),
    BEGIN(1, "进行中"),
    FINISH(2,"已结束");

    private Integer status;

    private String msg;

    private static final Map<Integer, RigStatusEnum> MAP = Maps.newHashMap();

    static {
        for (RigStatusEnum item : RigStatusEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static RigStatusEnum index(Integer status) {
        return status == null? null:MAP.get(status);
    }

    RigStatusEnum(Integer status, String msg) {
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
