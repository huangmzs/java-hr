package com.java158.hr.entity;

import java.io.Serializable;

public class EngageMajorReleaseWithBLOBs extends EngageMajorRelease implements Serializable {
    private String majorDescribe;

    private String engageRequired;

    private static final long serialVersionUID = 1L;

    public String getMajorDescribe() {
        return majorDescribe;
    }

    public void setMajorDescribe(String majorDescribe) {
        this.majorDescribe = majorDescribe == null ? null : majorDescribe.trim();
    }

    public String getEngageRequired() {
        return engageRequired;
    }

    public void setEngageRequired(String engageRequired) {
        this.engageRequired = engageRequired == null ? null : engageRequired.trim();
    }
}