package com.java158.hr.entity;

import java.io.Serializable;

public class ConfigMajorKind implements Serializable {
    private Short mfkId;

    private String majorKindId;

    private String majorKindName;

    private static final long serialVersionUID = 1L;

    public Short getMfkId() {
        return mfkId;
    }

    public void setMfkId(Short mfkId) {
        this.mfkId = mfkId;
    }

    public String getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId == null ? null : majorKindId.trim();
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName == null ? null : majorKindName.trim();
    }
}