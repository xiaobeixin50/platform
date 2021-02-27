package com.beiken.saas.platform.pojo;

import java.util.Date;

public class BgInspectItem {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String inspectItemCode;

    private String bgCode;

    private String inspectType;

    private String manageType;

    private String region;

    private String equipment;

    private String adapt;

    private Integer dangerLevel;

    private String site;

    private Integer isPhoto;

    private Integer isCard;

    private String cardSite;

    private String controlExtra;

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

    public String getInspectItemCode() {
        return inspectItemCode;
    }

    public void setInspectItemCode(String inspectItemCode) {
        this.inspectItemCode = inspectItemCode == null ? null : inspectItemCode.trim();
    }

    public String getBgCode() {
        return bgCode;
    }

    public void setBgCode(String bgCode) {
        this.bgCode = bgCode == null ? null : bgCode.trim();
    }

    public String getInspectType() {
        return inspectType;
    }

    public void setInspectType(String inspectType) {
        this.inspectType = inspectType == null ? null : inspectType.trim();
    }

    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType == null ? null : manageType.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment == null ? null : equipment.trim();
    }

    public String getAdapt() {
        return adapt;
    }

    public void setAdapt(String adapt) {
        this.adapt = adapt == null ? null : adapt.trim();
    }

    public Integer getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(Integer dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getIsPhoto() {
        return isPhoto;
    }

    public void setIsPhoto(Integer isPhoto) {
        this.isPhoto = isPhoto;
    }

    public Integer getIsCard() {
        return isCard;
    }

    public void setIsCard(Integer isCard) {
        this.isCard = isCard;
    }

    public String getCardSite() {
        return cardSite;
    }

    public void setCardSite(String cardSite) {
        this.cardSite = cardSite == null ? null : cardSite.trim();
    }

    public String getControlExtra() {
        return controlExtra;
    }

    public void setControlExtra(String controlExtra) {
        this.controlExtra = controlExtra == null ? null : controlExtra.trim();
    }
}