package com.beiken.saas.platform.pojo;

import java.util.Date;

public class InspectPlanDeptDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String inspcetPlanCode;

    private String deptCode;

    private String deptName;

    private String deptParentCode;

    private String deptParentName;

    private Long inspectUserId;

    private String inspectUserName;

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

    public String getInspcetPlanCode() {
        return inspcetPlanCode;
    }

    public void setInspcetPlanCode(String inspcetPlanCode) {
        this.inspcetPlanCode = inspcetPlanCode == null ? null : inspcetPlanCode.trim();
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
}