package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVO implements Serializable{
    private static final long serialVersionUID = -3437250780069149654L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 账号
     */
    private String account;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 注册时间
     */
    private Date registerTime;
    /**
     * 角色
     */
    private String role;
    /**
     * 头像
     */
    private String profilePhoto;
    /**
     * 部门id
     */
    private Long depId;

    /**
     * 部门名称
     */
    private String depName;
    /**
     * 职位
     */
    private String position;
}
