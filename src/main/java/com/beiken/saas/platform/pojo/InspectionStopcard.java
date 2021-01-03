package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectionStopcard {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;

    private String unsafeAction;

    private String eventType;

    private String siteStep;

    private String submitter;

    private Date submitTime;

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
        this.unsafeAction = unsafeAction == null ? null : unsafeAction.trim();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getSiteStep() {
        return siteStep;
    }

    public void setSiteStep(String siteStep) {
        this.siteStep = siteStep == null ? null : siteStep.trim();
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
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