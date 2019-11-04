package com.java158.hr.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer roleId;

    private String roleName;

    private String roleState;

    private Integer roleAvailable;

    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleState() {
        return roleState;
    }

    public void setRoleState(String roleState) {
        this.roleState = roleState == null ? null : roleState.trim();
    }

    public Integer getRoleAvailable() {
        return roleAvailable;
    }

    public void setRoleAvailable(Integer roleAvailable) {
        this.roleAvailable = roleAvailable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}