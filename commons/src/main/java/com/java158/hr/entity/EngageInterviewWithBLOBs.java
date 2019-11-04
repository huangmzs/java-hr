package com.java158.hr.entity;

import java.io.Serializable;

public class EngageInterviewWithBLOBs extends EngageInterview implements Serializable {
    private String interviewComment;

    private String checkComment;

    private static final long serialVersionUID = 1L;

    public String getInterviewComment() {
        return interviewComment;
    }

    public void setInterviewComment(String interviewComment) {
        this.interviewComment = interviewComment == null ? null : interviewComment.trim();
    }

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }
}