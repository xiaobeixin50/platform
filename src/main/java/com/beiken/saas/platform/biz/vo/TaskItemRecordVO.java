package com.beiken.saas.platform.biz.vo;

import lombok.Data;

/**
 * 任务项记录
 */
@Data
public class TaskItemRecordVO {
    private String feedBack;

    private String feedBackOption;

    private String code;

    private String description;

    private Long id;

    private String rfid;

}
