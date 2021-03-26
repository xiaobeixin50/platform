package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectTaskItemDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String taskCode;

    private String bgItemCode;

    private Integer resultStatus;

    private Date endDate;

    private String reportExtra;

    private Date reportTime;

    private String rigCode;

    private Long deptId;

    private Long rigId;

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

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public String getBgItemCode() {
        return bgItemCode;
    }

    public void setBgItemCode(String bgItemCode) {
        this.bgItemCode = bgItemCode == null ? null : bgItemCode.trim();
    }

    public Integer getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReportExtra() {
        return reportExtra;
    }

    public void setReportExtra(String reportExtra) {
        this.reportExtra = reportExtra == null ? null : reportExtra.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getRigCode() {
        return rigCode;
    }

    public void setRigCode(String rigCode) {
        this.rigCode = rigCode == null ? null : rigCode.trim();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getRigId() {
        return rigId;
    }

    public void setRigId(Long rigId) {
        this.rigId = rigId;
    }
}