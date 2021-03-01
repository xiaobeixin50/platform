package com.beiken.saas.platform.pojo;

import java.util.Date;

public class HiddenDangerCheckDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String dangerCode;

    private String type;

    private String extra;

    private Integer status;

    private Long inspectUserId;

    private String inspectUserName;

    private String inspectUserRole;

    private String inspectUserDept;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getInspectUserDept() {
        return inspectUserDept;
    }

    public void setInspectUserDept(String inspectUserDept) {
        this.inspectUserDept = inspectUserDept == null ? null : inspectUserDept.trim();
    }
}