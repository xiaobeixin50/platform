package com.beiken.saas.platform.controller.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SendVerifyCodeParam {
    @ApiModelProperty(name = "userId", value = "用户的唯一id"
            , required = true, example = "")
    private Long userId;

    @ApiModelProperty(name = "mobile", value = "用户手机号"
            , required = true, example = "")
    private String mobile;

    /**
     * mock标志，mock为1表示不实际发送短信
     */
    @ApiModelProperty(name = "mock", value = "模拟发送短信,只有传入0时，才能实际发送短信；为空或1时，不发送短信，其他操作正常进行"
            , required = false, example = "0, 1")
    private Integer mock;
}
