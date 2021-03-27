package com.beiken.saas.platform.controller.model;

import lombok.Data;

@Data
public class SendVerifyCodeParam {
    private Long userId;

    private String mobile;

    /**
     * mock标志，mock为1表示不实际发送短信
     */
    private Integer mock;
}
