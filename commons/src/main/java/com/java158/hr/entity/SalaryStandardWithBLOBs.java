package com.java158.hr.entity;

import java.io.Serializable;

public class SalaryStandardWithBLOBs extends SalaryStandard implements Serializable {
    private String checkComment;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}