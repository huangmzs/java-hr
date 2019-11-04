package com.java158.hr.entity;

import java.io.Serializable;

public class ConfigPublicChar implements Serializable {
    private Short pbcId;

    private String attributeKind;

    private String attributeName;

    private static final long serialVersionUID = 1L;

    public Short getPbcId() {
        return pbcId;
    }

    public void setPbcId(Short pbcId) {
        this.pbcId = pbcId;
    }

    public String getAttributeKind() {
        return attributeKind;
    }

    public void setAttributeKind(String attributeKind) {
        this.attributeKind = attributeKind == null ? null : attributeKind.trim();
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }
}