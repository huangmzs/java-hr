package com.java158.hr.entity;

import java.io.Serializable;

public class PRoleTable implements Serializable {
    private Integer prId;

    private Integer roleId;

    private Integer mentId;

    private static final long serialVersionUID = 1L;

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMentId() {
        return mentId;
    }

    public void setMentId(Integer mentId) {
        this.mentId = mentId;
    }
}