package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectionItemPlan {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String categoryFirst;

    private String categorySecond;

    private String catetoryThird;

    private String categoryFourth;

    private String taskName;

    private String content;

    private String cycleUnit;

    private Integer cycleCount;

    private Integer checkFrequency;

    private String dispatchScope;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private Integer level;

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

    public String getCategoryFirst() {
        return categoryFirst;
    }

    public void setCategoryFirst(String categoryFirst) {
        this.categoryFirst = categoryFirst == null ? null : categoryFirst.trim();
    }

    public String getCategorySecond() {
        return categorySecond;
    }

    public void setCategorySecond(String categorySecond) {
        this.categorySecond = categorySecond == null ? null : categorySecond.trim();
    }

    public String getCatetoryThird() {
        return catetoryThird;
    }

    public void setCatetoryThird(String catetoryThird) {
        this.catetoryThird = catetoryThird == null ? null : catetoryThird.trim();
    }

    public String getCategoryFourth() {
        return categoryFourth;
    }

    public void setCategoryFourth(String categoryFourth) {
        this.categoryFourth = categoryFourth == null ? null : categoryFourth.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(String cycleUnit) {
        this.cycleUnit = cycleUnit == null ? null : cycleUnit.trim();
    }

    public Integer getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    public Integer getCheckFrequency() {
        return checkFrequency;
    }

    public void setCheckFrequency(Integer checkFrequency) {
        this.checkFrequency = checkFrequency;
    }

    public String getDispatchScope() {
        return dispatchScope;
    }

    public void setDispatchScope(String dispatchScope) {
        this.dispatchScope = dispatchScope == null ? null : dispatchScope.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}