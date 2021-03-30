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

    private Long deptId;

    private String deptName;

    private Long parentDeptId;

    private String parentDeptName;

    private Integer dangerLevel;

    private String breakUserId;

    private String breakUserName;

    private Long responsibilityUserId;

    private String responsibilityUserName;

    private Long confirmUserId;

    private String confirmUserName;

    private Date confirmTime;

    private Date reportTime;

    private Date changeEndDate;

    private Integer reportType;

    private Integer reportStatus;

    private Long disLevelUserId;

    private String disLevelUserName;

    private String disUserRole;

    private Date disLevelTime;

    private String changePlan;

    private String changeAttach;

    private Double changeMoney;

    private Integer changeUserId;

    private String changeUserName;

    private String changeUserRole;

    private Date changeSubmitTime;

    private Long inspectUserId;

    private String inspectUserName;

    private String inspectUserRole;

    private String inspectExtra;

    private String inspectPhoto;

    private Integer inspectStatus;

    private Date inspectTime;

    private String rigCode;

    private Long rigId;

    private String envPhoto;

    private String envExtra;

    private Integer envStatus;

    private Date envTime;

    private Long envUserId;

    private String envUserName;

    private String envUserRole;

    private Long findUserId;

    private String findUserName;

    private Long closeUserId;

    private String closeUserName;

    private String closeExtra;

    private Date changeEndTime;

    private Date closeTime;

    private Integer isInspect;

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

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Long getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(Long parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    public String getParentDeptName() {
        return parentDeptName;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName == null ? null : parentDeptName.trim();
    }

    public Integer getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(Integer dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public String getBreakUserId() {
        return breakUserId;
    }

    public void setBreakUserId(String breakUserId) {
        this.breakUserId = breakUserId == null ? null : breakUserId.trim();
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

    public Long getConfirmUserId() {
        return confirmUserId;
    }

    public void setConfirmUserId(Long confirmUserId) {
        this.confirmUserId = confirmUserId;
    }

    public String getConfirmUserName() {
        return confirmUserName;
    }

    public void setConfirmUserName(String confirmUserName) {
        this.confirmUserName = confirmUserName == null ? null : confirmUserName.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getChangeEndDate() {
        return changeEndDate;
    }

    public void setChangeEndDate(Date changeEndDate) {
        this.changeEndDate = changeEndDate;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
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

    public String getDisUserRole() {
        return disUserRole;
    }

    public void setDisUserRole(String disUserRole) {
        this.disUserRole = disUserRole == null ? null : disUserRole.trim();
    }

    public Date getDisLevelTime() {
        return disLevelTime;
    }

    public void setDisLevelTime(Date disLevelTime) {
        this.disLevelTime = disLevelTime;
    }

    public String getChangePlan() {
        return changePlan;
    }

    public void setChangePlan(String changePlan) {
        this.changePlan = changePlan == null ? null : changePlan.trim();
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

    public String getChangeUserRole() {
        return changeUserRole;
    }

    public void setChangeUserRole(String changeUserRole) {
        this.changeUserRole = changeUserRole == null ? null : changeUserRole.trim();
    }

    public Date getChangeSubmitTime() {
        return changeSubmitTime;
    }

    public void setChangeSubmitTime(Date changeSubmitTime) {
        this.changeSubmitTime = changeSubmitTime;
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

    public String getInspectUserRole() {
        return inspectUserRole;
    }

    public void setInspectUserRole(String inspectUserRole) {
        this.inspectUserRole = inspectUserRole == null ? null : inspectUserRole.trim();
    }

    public String getInspectExtra() {
        return inspectExtra;
    }

    public void setInspectExtra(String inspectExtra) {
        this.inspectExtra = inspectExtra == null ? null : inspectExtra.trim();
    }

    public String getInspectPhoto() {
        return inspectPhoto;
    }

    public void setInspectPhoto(String inspectPhoto) {
        this.inspectPhoto = inspectPhoto == null ? null : inspectPhoto.trim();
    }

    public Integer getInspectStatus() {
        return inspectStatus;
    }

    public void setInspectStatus(Integer inspectStatus) {
        this.inspectStatus = inspectStatus;
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public String getRigCode() {
        return rigCode;
    }

    public void setRigCode(String rigCode) {
        this.rigCode = rigCode == null ? null : rigCode.trim();
    }

    public Long getRigId() {
        return rigId;
    }

    public void setRigId(Long rigId) {
        this.rigId = rigId;
    }

    public String getEnvPhoto() {
        return envPhoto;
    }

    public void setEnvPhoto(String envPhoto) {
        this.envPhoto = envPhoto == null ? null : envPhoto.trim();
    }

    public String getEnvExtra() {
        return envExtra;
    }

    public void setEnvExtra(String envExtra) {
        this.envExtra = envExtra == null ? null : envExtra.trim();
    }

    public Integer getEnvStatus() {
        return envStatus;
    }

    public void setEnvStatus(Integer envStatus) {
        this.envStatus = envStatus;
    }

    public Date getEnvTime() {
        return envTime;
    }

    public void setEnvTime(Date envTime) {
        this.envTime = envTime;
    }

    public Long getEnvUserId() {
        return envUserId;
    }

    public void setEnvUserId(Long envUserId) {
        this.envUserId = envUserId;
    }

    public String getEnvUserName() {
        return envUserName;
    }

    public void setEnvUserName(String envUserName) {
        this.envUserName = envUserName == null ? null : envUserName.trim();
    }

    public String getEnvUserRole() {
        return envUserRole;
    }

    public void setEnvUserRole(String envUserRole) {
        this.envUserRole = envUserRole == null ? null : envUserRole.trim();
    }

    public Long getFindUserId() {
        return findUserId;
    }

    public void setFindUserId(Long findUserId) {
        this.findUserId = findUserId;
    }

    public String getFindUserName() {
        return findUserName;
    }

    public void setFindUserName(String findUserName) {
        this.findUserName = findUserName == null ? null : findUserName.trim();
    }

    public Long getCloseUserId() {
        return closeUserId;
    }

    public void setCloseUserId(Long closeUserId) {
        this.closeUserId = closeUserId;
    }

    public String getCloseUserName() {
        return closeUserName;
    }

    public void setCloseUserName(String closeUserName) {
        this.closeUserName = closeUserName == null ? null : closeUserName.trim();
    }

    public String getCloseExtra() {
        return closeExtra;
    }

    public void setCloseExtra(String closeExtra) {
        this.closeExtra = closeExtra == null ? null : closeExtra.trim();
    }

    public Date getChangeEndTime() {
        return changeEndTime;
    }

    public void setChangeEndTime(Date changeEndTime) {
        this.changeEndTime = changeEndTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getIsInspect() {
        return isInspect;
    }

    public void setIsInspect(Integer isInspect) {
        this.isInspect = isInspect;
    }
}