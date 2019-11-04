package com.java158.hr.entity;

import java.io.Serializable;

public class MajorChangeWithBLOBs extends MajorChange implements Serializable {
    private String changeReason;

    private String checkReason;

    private static final long serialVersionUID = 1L;

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
    }

    public String getCheckReason() {
        return checkReason;
    }

    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason == null ? null : checkReason.trim();
    }
}