package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.util.Date;

/**
 * 巡检任务记录
 */
@Data
public class TaskRecordVO {

    /**
     * 任务编号
     */
    private String code;
    /**
     * 复查任务关联上级任务编号
     */
    private String parentCode;
    /**
     * 任务标题
     */
    private String title;
    /**
     * 对应计划
     */
    private Long planId;
    /**
     * 完成时间
     */
    private Date finishTime;
    /**
     * 风险数
     */
    private Integer riskCount;
    /**
     * 要求巡检时间
     */
    private Date demandTime;

    /**
     * 任务项
     */
    private int itemCount;

    /**
     * 完成进度
     */
    private int process;

    /**
     * 任务状态
     */
    private int status;
}
