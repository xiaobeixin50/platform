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

    private Integer inspectUserId;

    private String inspectUserName;

    private String inspectUserRole;

    private String inspectExtra;

    private String inspectPhoto;

    private Integer inspectStatus;

    private Date inspectTime;

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

    public Integer getInspectUserId() {
        return inspectUserId;
    }

    public void setInspectUserId(Integer inspectUserId) {
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

    public String getInspectExtra() {
        return inspectExtra;
    }

    public void setInspectExtra(String inspectExtra) {
        this.inspectExtra = inspectExtra == null ? null : inspectExtra.trim();
    }

    public String getInspectPhoto() {
        return inspectPhoto;
    }

    public void setInspectPhoto(String inspectPhoto) {
        this.inspectPhoto = inspectPhoto == null ? null : inspectPhoto.trim();
    }

    public Integer getInspectStatus() {
        return inspectStatus;
    }

    public void setInspectStatus(Integer inspectStatus) {
        this.inspectStatus = inspectStatus;
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }
}