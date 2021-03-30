package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum TaskItemStatusEnum {

    QUALIFY(0, "合格"),
    DISQUALIFY(1, "不合格"),
    NON_REFER(2, "不涉及"),
    AFTER_TIME(3, "已过期");

    private Integer status;

    private String msg;

    private static final Map<Integer, TaskItemStatusEnum> MAP = Maps.newHashMap();

    static {
        for (TaskItemStatusEnum item : TaskItemStatusEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static TaskItemStatusEnum index(Integer status) {
        return status == null ? null : MAP.get(status);
    }

    TaskItemStatusEnum(Integer status, String msg) {
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
