package com.beiken.saas.platform.pojo;

import java.util.Date;

public class EnvDO {
    private Long id;

    private Long dangerId;

    private String envPhoto;

    private String envExtra;

    private Integer envStatus;

    private Date envTime;

    private Long envUserId;

    private String envUserName;

    private String envUserRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDangerId() {
        return dangerId;
    }

    public void setDangerId(Long dangerId) {
        this.dangerId = dangerId;
    }

    public String getEnvPhoto() {
        return envPhoto;
    }

    public void setEnvPhoto(String envPhoto) {
        this.envPhoto = envPhoto == null ? null : envPhoto.trim();
    }

    public String getEnvExtra() {
        return envExtra;
    }

    public void setEnvExtra(String envExtra) {
        this.envExtra = envExtra == null ? null : envExtra.trim();
    }

    public Integer getEnvStatus() {
        return envStatus;
    }

    public void setEnvStatus(Integer envStatus) {
        this.envStatus = envStatus;
    }

    public Date getEnvTime() {
        return envTime;
    }

    public void setEnvTime(Date envTime) {
        this.envTime = envTime;
    }

    public Long getEnvUserId() {
        return envUserId;
    }

    public void setEnvUserId(Long envUserId) {
        this.envUserId = envUserId;
    }

    public String getEnvUserName() {
        return envUserName;
    }

    public void setEnvUserName(String envUserName) {
        this.envUserName = envUserName == null ? null : envUserName.trim();
    }

    public String getEnvUserRole() {
        return envUserRole;
    }

    public void setEnvUserRole(String envUserRole) {
        this.envUserRole = envUserRole == null ? null : envUserRole.trim();
    }
}