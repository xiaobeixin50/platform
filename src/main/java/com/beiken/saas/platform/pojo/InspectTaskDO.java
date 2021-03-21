package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectTaskDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String name;

    private String taskCode;

    private String inspectPlanCode;

    private Date startTime;

    private Date endTime;

    private Date finishTime;

    private Integer status;

    private Long rigId;

    private String rigCode;

    private Long inspectUserId;

    private String inspectUserName;

    private Integer quickly;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public String getInspectPlanCode() {
        return inspectPlanCode;
    }

    public void setInspectPlanCode(String inspectPlanCode) {
        this.inspectPlanCode = inspectPlanCode == null ? null : inspectPlanCode.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getRigId() {
        return rigId;
    }

    public void setRigId(Long rigId) {
        this.rigId = rigId;
    }

    public String getRigCode() {
        return rigCode;
    }

    public void setRigCode(String rigCode) {
        this.rigCode = rigCode == null ? null : rigCode.trim();
    }

    public Long getInspectUserId() {
        return inspectUserId;
    }

    public void setInspectUserId(Long inspectUserId) {
        this.inspectUserId = inspectUserId;
    }

    public String getInspectUserName() {
        return inspectUserName;
    }

    public void setInspectUserName(String inspectUserName) {
        this.inspectUserName = inspectUserName == null ? null : inspectUserName.trim();
    }

    public Integer getQuickly() {
        return quickly;
    }

    public void setQuickly(Integer quickly) {
        this.quickly = quickly;
    }
}