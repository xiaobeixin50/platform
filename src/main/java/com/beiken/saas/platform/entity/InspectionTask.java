package com.beiken.saas.platform.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (InspectionTask)实体类
 *
 * @author xiaobeixin
 * @since 2020-11-21 11:15:06
 */
public class InspectionTask implements Serializable {
    private static final long serialVersionUID = 445455661977233710L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 任务编号
     */
    private String code;
    /**
     * 复查任务关联上级任务编号
     */
    private String parentCode;
    /**
     * 任务标题
     */
    private String title;
    /**
     * 对应计划
     */
    private Long planId;
    /**
     * 下发时间
     */
    private Date dispatchTime;
    /**
     * 下发范围（分公司、井位、人员）
     */
    private String dispatchScope;
    /**
     * 要求巡检时间
     */
    private Date demandTime;
    /**
     * 检查项列表
     */
    private String itemList;
    /**
     * 任务状态
     */
    private Integer status;
    /**
     * 提交时间
     */
    private Date submitTime;


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
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getDispatchScope() {
        return dispatchScope;
    }

    public void setDispatchScope(String dispatchScope) {
        this.dispatchScope = dispatchScope;
    }

    public Date getDemandTime() {
        return demandTime;
    }

    public void setDemandTime(Date demandTime) {
        this.demandTime = demandTime;
    }

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

}