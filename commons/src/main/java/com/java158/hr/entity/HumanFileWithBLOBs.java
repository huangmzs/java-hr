package com.java158.hr.entity;

import java.io.Serializable;

public class HumanFileWithBLOBs extends HumanFile implements Serializable {
    private String remark;

    private String humanHistroyRecords;

    private String humanFamilyMembership;

    private static final long serialVersionUID = 1L;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHumanHistroyRecords() {
        return humanHistroyRecords;
    }

    public void setHumanHistroyRecords(String humanHistroyRecords) {
        this.humanHistroyRecords = humanHistroyRecords == null ? null : humanHistroyRecords.trim();
    }

    public String getHumanFamilyMembership() {
        return humanFamilyMembership;
    }

    public void setHumanFamilyMembership(String humanFamilyMembership) {
        this.humanFamilyMembership = humanFamilyMembership == null ? null : humanFamilyMembership.trim();
    }
}