package com.java158.hr.entity;

import java.io.Serializable;

public class Permissions implements Serializable {
    private Integer mentId;

    private String mentName;

    private Integer mentState;

    private String mentUrl;

    private Integer superMentId;

    private static final long serialVersionUID = 1L;

    public Integer getMentId() {
        return mentId;
    }

    public void setMentId(Integer mentId) {
        this.mentId = mentId;
    }

    public String getMentName() {
        return mentName;
    }

    public void setMentName(String mentName) {
        this.mentName = mentName == null ? null : mentName.trim();
    }

    public Integer getMentState() {
        return mentState;
    }

    public void setMentState(Integer mentState) {
        this.mentState = mentState;
    }

    public String getMentUrl() {
        return mentUrl;
    }

    public void setMentUrl(String mentUrl) {
        this.mentUrl = mentUrl == null ? null : mentUrl.trim();
    }

    public Integer getSuperMentId() {
        return superMentId;
    }

    public void setSuperMentId(Integer superMentId) {
        this.superMentId = superMentId;
    }
}