package com.java158.hr.entity;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer uId;

    private String uName;

    private String uTrueName;

    private String uPassword;

    private Integer uRoleId;

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuTrueName() {
        return uTrueName;
    }

    public void setuTrueName(String uTrueName) {
        this.uTrueName = uTrueName == null ? null : uTrueName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuRoleId() {
        return uRoleId;
    }

    public void setuRoleId(Integer uRoleId) {
        this.uRoleId = uRoleId;
    }
}