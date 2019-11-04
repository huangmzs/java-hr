package com.java158.hr.entity;

import java.io.Serializable;

public class ConfigFileSecondKindWithBLOBs extends ConfigFileSecondKind implements Serializable {
    private String secondSalaryId;

    private String secondSaleId;

    private static final long serialVersionUID = 1L;

    public String getSecondSalaryId() {
        return secondSalaryId;
    }

    public void setSecondSalaryId(String secondSalaryId) {
        this.secondSalaryId = secondSalaryId == null ? null : secondSalaryId.trim();
    }

    public String getSecondSaleId() {
        return secondSaleId;
    }

    public void setSecondSaleId(String secondSaleId) {
        this.secondSaleId = secondSaleId == null ? null : secondSaleId.trim();
    }
}