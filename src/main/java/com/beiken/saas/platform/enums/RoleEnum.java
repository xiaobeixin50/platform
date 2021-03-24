package com.beiken.saas.platform.enums;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午5:56
 */
public enum RoleEnum {

    RIG_MANAGER(0, "井队长"),
    MANAGER(1, "监理"),
    ADMIN(2,"管理员"),
    EMPLOY(3,"一线员工");

    private Integer status;

    private String msg;

    private static final Map<Integer, RoleEnum> MAP = Maps.newHashMap();

    static {
        for (RoleEnum item : RoleEnum.values()) {
            MAP.put(item.status, item);
        }
    }

    public static Integer index(String msg) {
        if (StringUtils.isBlank(msg)) {
            return null;
        }
        for (RoleEnum item : RoleEnum.values()) {
            if (item.getMsg().equals(msg)) {
                return item.getStatus();
            }
        }
        return null;
    }


    public static RoleEnum index(Integer status) {
        return status == null? null:MAP.get(status);
    }

    RoleEnum(Integer status, String msg) {
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
