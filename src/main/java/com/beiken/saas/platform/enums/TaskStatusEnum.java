package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum TaskStatusEnum {

    NOT_BEGIN(0, "未完成"),
    FINISH(1, "已完成"),
    AFTER_TIME(2, "已过期");

    private Integer status;

    private String msg;

    private static final Map<Integer, TaskStatusEnum> MAP = Maps.newHashMap();

    static {
        for (TaskStatusEnum item : TaskStatusEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static TaskStatusEnum index(Integer status) {
        return status == null ? null : MAP.get(status);
    }

    TaskStatusEnum(Integer status, String msg) {
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
