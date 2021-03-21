package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVO implements Serializable{
    private static final long serialVersionUID = -3437250780069149654L;
    /**
     * 主键
     */
    @ApiModelProperty(name = "id", value = "用户id,非工号"
            , required = false, example = "")
    private Long id;

    /**
     * 账号
     */
    @ApiModelProperty(name = "account", value = "账号,工号"
            , required = false, example = "")
    private String account;
    /**
     * 姓名
     */
    @ApiModelProperty(name = "name", value = "姓名"
            , required = false, example = "")
    private String name;
    /**
     * 密码
     */
    @ApiModelProperty(name = "password", value = "密码"
            , required = false, example = "")
    private String password;
    /**
     * 注册时间
     */
    @ApiModelProperty(name = "registerTime", value = "注册时间"
            , required = false, example = "")
    private Date registerTime;
    /**
     * 角色
     */
    @ApiModelProperty(name = "role", value = "角色"
            , required = false, example = "")
    private String role;
    /**
     * 头像
     */
    @ApiModelProperty(name = "profilePhoto", value = "头像地址"
            , required = false, example = "")
    private String profilePhoto;
    /**
     * 部门id
     */
    @ApiModelProperty(name = "depId", value = "部门id"
            , required = false, example = "")
    private Long depId;

    /**
     * 部门名称
     */
    @ApiModelProperty(name = "depName", value = "部门名"
            , required = false, example = "")
    private String depName;

    /**
     * 部门id
     */
    @ApiModelProperty(name = "parentDepId", value = "公司id"
            , required = false, example = "")
    private Long parentDepId;

    /**
     * 部门名称
     */
    @ApiModelProperty(name = "parentDepName", value = "公司名"
            , required = false, example = "")
    private String parentDepName;
    /**
     * 职位
     */
    @ApiModelProperty(name = "position", value = "职位"
            , required = false, example = "")
    private String position;
}
