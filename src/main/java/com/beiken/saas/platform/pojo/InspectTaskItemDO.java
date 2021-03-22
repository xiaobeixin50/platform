package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectTaskItemDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String taskCode;

    private String inspectPlanCode;

    private String bgItemCode;

    private Integer resultStatus;

    private Date endDate;

    private String reportExtra;

    private Date reportTime;

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

    public String getInspectPlanCode() {
        return inspectPlanCode;
    }

    public void setInspectPlanCode(String inspectPlanCode) {
        this.inspectPlanCode = inspectPlanCode == null ? null : inspectPlanCode.trim();
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
}