package com.beiken.saas.platform.utils.model;

import lombok.Data;

@Data
public class SmsResult {

    private String SendId;
    private Integer InvalidCount;
    private Integer SuccessCount;
    private Integer BlackCount;
    private Integer Code;
    private String Message;


}
