package com.beiken.saas.platform.biz.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/8
 * Time: 下午7:23
 */
@Data
public class UserQuery implements Serializable {
    private static final long serialVersionUID = -7306315785382567020L;

    @ApiModelProperty(name = "userId", value = "主键id-全局唯一"
            , required = false, example = "")
    private Long userId;

    @ApiModelProperty(name = "userName", value = "用户名"
            , required = false, example = "")
    private String userName;

    @ApiModelProperty(name = "accountId", value = "用户手机号-登录时传这个参数"
            , required = false, example = "")
    private String accountId;

    @ApiModelProperty(name = "password", value = "密码"
            , required = false, example = "")
    private String password;

    private Integer pageNo;

    private Integer pageSize;
}
