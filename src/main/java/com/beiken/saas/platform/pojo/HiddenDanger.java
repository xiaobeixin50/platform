package com.beiken.saas.platform.pojo;

import java.util.Date;

public class HiddenDanger {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

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

    private Integer deleted;

    private Long taskId;

    private Long taskItemId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOnsiteRecord() {
        return onsiteRecord;
    }

    public void setOnsiteRecord(String onsiteRecord) {
        this.onsiteRecord = onsiteRecord == null ? null : onsiteRecord.trim();
    }

    public String getOnsiteManager() {
        return onsiteManager;
    }

    public void setOnsiteManager(String onsiteManager) {
        this.onsiteManager = onsiteManager == null ? null : onsiteManager.trim();
    }

    public String getOnsiteManagerCode() {
        return onsiteManagerCode;
    }

    public void setOnsiteManagerCode(String onsiteManagerCode) {
        this.onsiteManagerCode = onsiteManagerCode == null ? null : onsiteManagerCode.trim();
    }

    public String getFollowUp() {
        return followUp;
    }

    public void setFollowUp(String followUp) {
        this.followUp = followUp == null ? null : followUp.trim();
    }

    public Date getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Date planTime) {
        this.planTime = planTime;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public String getSupervisorCode() {
        return supervisorCode;
    }

    public void setSupervisorCode(String supervisorCode) {
        this.supervisorCode = supervisorCode == null ? null : supervisorCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskItemId() {
        return taskItemId;
    }

    public void setTaskItemId(Long taskItemId) {
        this.taskItemId = taskItemId;
    }
}