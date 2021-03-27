package com.beiken.saas.platform.controller.model;

import lombok.Data;

@Data
public class CheckVerifyCodeParam {

    private String mobile;
    private String verifyCode;

}
