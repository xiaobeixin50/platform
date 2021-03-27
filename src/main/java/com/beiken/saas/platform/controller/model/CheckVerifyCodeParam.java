package com.beiken.saas.platform.controller.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckVerifyCodeParam {

    @ApiModelProperty(name = "mobile", value = "用户手机号"
            , required = true, example = "")
    private String mobile;

    @ApiModelProperty(name = "verifyCode", value = "用户收到的验证码"
            , required = true, example = "123456")
    private String verifyCode;

}
