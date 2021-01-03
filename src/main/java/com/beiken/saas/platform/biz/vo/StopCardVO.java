package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.util.Date;

@Data
public class StopCardVO {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;
    /**
     * 观察到的不安全行为
     */
    private String unsafeAction;
    /**
     * 事件分类
     */
    private String eventType;
    /**
     * 采取措施
     */
    private String siteStep;
    /**
     * 提交人
     */
    private String submitter;
    /**
     * 提交时间
     */
    private Date submitTime;
    /**
     * 审核状态，0-待审核，1-整改中，2-已处理
     */
    private Integer status;

}
