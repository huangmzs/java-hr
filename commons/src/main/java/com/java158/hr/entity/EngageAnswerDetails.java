package com.java158.hr.entity;

import java.io.Serializable;

public class EngageAnswerDetails implements Serializable {
    private Short andId;

    private String answerNumber;

    private Short subjectId;

    private String answer;

    private static final long serialVersionUID = 1L;

    public Short getAndId() {
        return andId;
    }

    public void setAndId(Short andId) {
        this.andId = andId;
    }

    public String getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(String answerNumber) {
        this.answerNumber = answerNumber == null ? null : answerNumber.trim();
    }

    public Short getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Short subjectId) {
        this.subjectId = subjectId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}