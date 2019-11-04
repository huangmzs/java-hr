package com.java158.hr.entity;

import java.io.Serializable;

public class ConfigFileFirstKindWithBLOBs extends ConfigFileFirstKind implements Serializable {
    private String firstKindSalaryId;

    private String firstKindSaleId;

    private static final long serialVersionUID = 1L;

    public String getFirstKindSalaryId() {
        return firstKindSalaryId;
    }

    public void setFirstKindSalaryId(String firstKindSalaryId) {
        this.firstKindSalaryId = firstKindSalaryId == null ? null : firstKindSalaryId.trim();
    }

    public String getFirstKindSaleId() {
        return firstKindSaleId;
    }

    public void setFirstKindSaleId(String firstKindSaleId) {
        this.firstKindSaleId = firstKindSaleId == null ? null : firstKindSaleId.trim();
    }
}