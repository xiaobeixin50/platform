package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectionItemRecord {
    private Long id;

    private String gmtCreate;

    private String gmtModified;

    private String creator;

    private String moidifier;

    private String taskRecordId;

    private String rfid;

    private String channel;

    private String taskCode;

    private Date recordTime;

    private String recorder;

    private String feedback;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified == null ? null : gmtModified.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getMoidifier() {
        return moidifier;
    }

    public void setMoidifier(String moidifier) {
        this.moidifier = moidifier == null ? null : moidifier.trim();
    }

    public String getTaskRecordId() {
        return taskRecordId;
    }

    public void setTaskRecordId(String taskRecordId) {
        this.taskRecordId = taskRecordId == null ? null : taskRecordId.trim();
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }
}