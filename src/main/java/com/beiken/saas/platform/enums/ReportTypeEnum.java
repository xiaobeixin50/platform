package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum ReportTypeEnum {

    ONE_DANGER(0, "任务上报"),
    TWO_DANGER(1, "现场快报");

    private Integer status;

    private String msg;

    public static final Map<Integer, ReportTypeEnum> MAP = Maps.newLinkedHashMap();

    static {
        for (ReportTypeEnum item : ReportTypeEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static ReportTypeEnum index(Integer status) {
        return status == null? null:MAP.get(status);
    }

    ReportTypeEnum(Integer status, String msg) {
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
