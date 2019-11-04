package com.java158.hr.entity;

import java.io.Serializable;

public class ConfigFileSecondKind implements Serializable {
    private Short fskId;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private static final long serialVersionUID = 1L;

    public Short getFskId() {
        return fskId;
    }

    public void setFskId(Short fskId) {
        this.fskId = fskId;
    }

    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId == null ? null : firstKindId.trim();
    }

    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName == null ? null : firstKindName.trim();
    }

    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId == null ? null : secondKindId.trim();
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName == null ? null : secondKindName.trim();
    }
}