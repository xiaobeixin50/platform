package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.util.Date;

@Data
public class HiddenDangerVO {
    private String kind;

    private String level;

    private String description;

    private String onsiteRecord;

    private String onsiteManager;

    private String onsiteManagerCode;

    private String followUp;

    private Date planTime;

    private String supervisor;

    private String supervisorCode;

    private Integer status;
}
