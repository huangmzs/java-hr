package com.java158.hr.entity;

import java.io.Serializable;

public class EngageResumeWithBLOBs extends EngageResume implements Serializable {
    private String humanHistoryRecords;

    private String remark;

    private String recomandation;

    private static final long serialVersionUID = 1L;

    public String getHumanHistoryRecords() {
        return humanHistoryRecords;
    }

    public void setHumanHistoryRecords(String humanHistoryRecords) {
        this.humanHistoryRecords = humanHistoryRecords == null ? null : humanHistoryRecords.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRecomandation() {
        return recomandation;
    }

    public void setRecomandation(String recomandation) {
        this.recomandation = recomandation == null ? null : recomandation.trim();
    }
}