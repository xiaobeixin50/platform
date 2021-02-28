package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectTaskItem {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String itemCode;

    private String taskCode;

    private String inspectPlanCode;

    private String bgItemCode;

    private String photo;

    private String extra;

    private String dangerLevel;

    private String breakUser;

    private String responsbilityUser;

    private Integer resultStatus;

    private Date endDate;

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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel == null ? null : dangerLevel.trim();
    }

    public String getBreakUser() {
        return breakUser;
    }

    public void setBreakUser(String breakUser) {
        this.breakUser = breakUser == null ? null : breakUser.trim();
    }

    public String getResponsbilityUser() {
        return responsbilityUser;
    }

    public void setResponsbilityUser(String responsbilityUser) {
        this.responsbilityUser = responsbilityUser == null ? null : responsbilityUser.trim();
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
}