package com.beiken.saas.platform.pojo;

import java.util.Date;

public class TaskUserDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long taskId;

    private String taskCode;

    private Long inspectUserId;

    private String inspectUserName;

    private Date taskStartTime;

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

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
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

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }
}