package com.beiken.saas.platform.controller.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckVerifyCodeParam {
    @ApiModelProperty(name = "userId", value = "用户的唯一id"
            , required = true, example = "1001")
    private Long userId;
    @ApiModelProperty(name = "verifyCode", value = "用户收到的验证码"
            , required = true, example = "123456")
    private String verifyCode;

}
