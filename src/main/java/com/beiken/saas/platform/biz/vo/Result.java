package com.beiken.saas.platform.biz.vo;

import lombok.Data;

@Data
public class Result<T> {

    private String msgCode;

    private String msgInfo;

    private T data;

    private Boolean success;

    public static <T> Result<T> success(T data){
        Result result = new Result();
        result.msgInfo = "成功";
        result.msgCode = "SUCCESS";
        result.data = data;
        result.success = true;
        return result;
    }

    public static <T> Result<T> failed(String msgCode, String msgInfo){
        Result result = new Result();
        result.msgCode = msgCode;
        result.msgInfo = msgInfo;
        result.success = false;
        return result;
    }
}
