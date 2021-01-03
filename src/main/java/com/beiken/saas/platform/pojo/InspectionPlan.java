package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectionPlan {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String creator;

    private String modifier;

    private String code;

    private String cycle;

    private Date firstTime;

    private Date validPeriod;

    private String dispatchScope;

    private String itemList;

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public Date getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
    }

    public Date getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Date validPeriod) {
        this.validPeriod = validPeriod;
    }

    public String getDispatchScope() {
        return dispatchScope;
    }

    public void setDispatchScope(String dispatchScope) {
        this.dispatchScope = dispatchScope == null ? null : dispatchScope.trim();
    }

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList == null ? null : itemList.trim();
    }
}