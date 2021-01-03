package com.beiken.saas.platform.pojo;

public class ExternalInspection {
    private Long id;

    private String gmtCreate;

    private String gmtModified;

    private String title;

    private String inspectUnit;

    private String inspectTime;

    private String productionUnit;

    private String inspectResult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified == null ? null : gmtModified.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getInspectUnit() {
        return inspectUnit;
    }

    public void setInspectUnit(String inspectUnit) {
        this.inspectUnit = inspectUnit == null ? null : inspectUnit.trim();
    }

    public String getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(String inspectTime) {
        this.inspectTime = inspectTime == null ? null : inspectTime.trim();
    }

    public String getProductionUnit() {
        return productionUnit;
    }

    public void setProductionUnit(String productionUnit) {
        this.productionUnit = productionUnit == null ? null : productionUnit.trim();
    }

    public String getInspectResult() {
        return inspectResult;
    }

    public void setInspectResult(String inspectResult) {
        this.inspectResult = inspectResult == null ? null : inspectResult.trim();
    }
}