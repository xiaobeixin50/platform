package com.beiken.saas.platform.pojo;

import java.util.Date;

public class Rig {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String rigCode;

    private String subCompany;

    private String subDept;

    private String area;

    private String model;

    private String type;

    private String extra;

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

    public String getRigCode() {
        return rigCode;
    }

    public void setRigCode(String rigCode) {
        this.rigCode = rigCode == null ? null : rigCode.trim();
    }

    public String getSubCompany() {
        return subCompany;
    }

    public void setSubCompany(String subCompany) {
        this.subCompany = subCompany == null ? null : subCompany.trim();
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String subDept) {
        this.subDept = subDept == null ? null : subDept.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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
}