package com.beiken.saas.platform.pojo;

import java.util.Date;

public class HiddenDangerDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String dangerCode;

    private String photo;

    private String reportExtra;

    private String taskCode;

    private String bgItemCode;

    private String deptCode;

    private String deptName;

    private String deptParentCode;

    private String deptParentName;

    private Integer dangerLevel;

    private String breakUserName;

    private Long responsibilityUserId;

    private String responsibilityUserName;

    private Date changeEndDate;

    private Integer resultStatus;

    private Integer reportType;

    private Long inspectUserId;

    private String inspectUserName;

    private String reportStatus;

    private Date reportTime;

    private Date confirmTime;

    private Long disLevelUserId;

    private String disLevelUserName;

    private Date disLevelTime;

    private String changeAttach;

    private Double changeMoney;

    private Integer changeUserId;

    private String changeUserName;

    private Date changeSubmitTime;

    private String changePlan;

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

    public String getDangerCode() {
        return dangerCode;
    }

    public void setDangerCode(String dangerCode) {
        this.dangerCode = dangerCode == null ? null : dangerCode.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getReportExtra() {
        return reportExtra;
    }

    public void setReportExtra(String reportExtra) {
        this.reportExtra = reportExtra == null ? null : reportExtra.trim();
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptParentCode() {
        return deptParentCode;
    }

    public void setDeptParentCode(String deptParentCode) {
        this.deptParentCode = deptParentCode == null ? null : deptParentCode.trim();
    }

    public String getDeptParentName() {
        return deptParentName;
    }

    public void setDeptParentName(String deptParentName) {
        this.deptParentName = deptParentName == null ? null : deptParentName.trim();
    }

    public Integer getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(Integer dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public String getBreakUserName() {
        return breakUserName;
    }

    public void setBreakUserName(String breakUserName) {
        this.breakUserName = breakUserName == null ? null : breakUserName.trim();
    }

    public Long getResponsibilityUserId() {
        return responsibilityUserId;
    }

    public void setResponsibilityUserId(Long responsibilityUserId) {
        this.responsibilityUserId = responsibilityUserId;
    }

    public String getResponsibilityUserName() {
        return responsibilityUserName;
    }

    public void setResponsibilityUserName(String responsibilityUserName) {
        this.responsibilityUserName = responsibilityUserName == null ? null : responsibilityUserName.trim();
    }

    public Date getChangeEndDate() {
        return changeEndDate;
    }

    public void setChangeEndDate(Date changeEndDate) {
        this.changeEndDate = changeEndDate;
    }

    public Integer getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
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

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus == null ? null : reportStatus.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Long getDisLevelUserId() {
        return disLevelUserId;
    }

    public void setDisLevelUserId(Long disLevelUserId) {
        this.disLevelUserId = disLevelUserId;
    }

    public String getDisLevelUserName() {
        return disLevelUserName;
    }

    public void setDisLevelUserName(String disLevelUserName) {
        this.disLevelUserName = disLevelUserName == null ? null : disLevelUserName.trim();
    }

    public Date getDisLevelTime() {
        return disLevelTime;
    }

    public void setDisLevelTime(Date disLevelTime) {
        this.disLevelTime = disLevelTime;
    }

    public String getChangeAttach() {
        return changeAttach;
    }

    public void setChangeAttach(String changeAttach) {
        this.changeAttach = changeAttach == null ? null : changeAttach.trim();
    }

    public Double getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(Double changeMoney) {
        this.changeMoney = changeMoney;
    }

    public Integer getChangeUserId() {
        return changeUserId;
    }

    public void setChangeUserId(Integer changeUserId) {
        this.changeUserId = changeUserId;
    }

    public String getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(String changeUserName) {
        this.changeUserName = changeUserName == null ? null : changeUserName.trim();
    }

    public Date getChangeSubmitTime() {
        return changeSubmitTime;
    }

    public void setChangeSubmitTime(Date changeSubmitTime) {
        this.changeSubmitTime = changeSubmitTime;
    }

    public String getChangePlan() {
        return changePlan;
    }

    public void setChangePlan(String changePlan) {
        this.changePlan = changePlan == null ? null : changePlan.trim();
    }
}