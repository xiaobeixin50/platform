package com.beiken.saas.platform.pojo;

public class HiddenDangerDOWithBLOBs extends HiddenDangerDO {
    private String photo;

    private String inspectPhoto;

    private String envPhoto;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getInspectPhoto() {
        return inspectPhoto;
    }

    public void setInspectPhoto(String inspectPhoto) {
        this.inspectPhoto = inspectPhoto == null ? null : inspectPhoto.trim();
    }

    public String getEnvPhoto() {
        return envPhoto;
    }

    public void setEnvPhoto(String envPhoto) {
        this.envPhoto = envPhoto == null ? null : envPhoto.trim();
    }
}