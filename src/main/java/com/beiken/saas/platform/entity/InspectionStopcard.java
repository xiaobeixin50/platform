package com.beiken.saas.platform.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (InspectionStopcard)实体类
 *
 * @author xiaobeixin
 * @since 2020-11-22 13:12:12
 */
public class InspectionStopcard implements Serializable {
    private static final long serialVersionUID = 211756479982302180L;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getUnsafeAction() {
        return unsafeAction;
    }

    public void setUnsafeAction(String unsafeAction) {
        this.unsafeAction = unsafeAction;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getSiteStep() {
        return siteStep;
    }

    public void setSiteStep(String siteStep) {
        this.siteStep = siteStep;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}