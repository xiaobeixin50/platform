package com.beiken.saas.platform.biz.vo;

import lombok.Data;

@Data
public class ExternalInspectionVO {
    private String gmtCreate;

    private String gmtModified;

    private String title;

    private String inspectUnit;

    private String inspectTime;

    private String productionUnit;

    private String inspectResult;
}
