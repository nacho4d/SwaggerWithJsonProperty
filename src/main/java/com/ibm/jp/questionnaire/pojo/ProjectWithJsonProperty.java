package com.ibm.jp.questionnaire.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ProjectWithJsonProperty {

    @JsonProperty(value="projectName", required = true)
    String name;

    @JsonProperty(value="完了", required = true)
    boolean finished;

    @JsonProperty(value="完了ヌルあり", required = false)
    Boolean completed;

    @JsonProperty(value="number-of-years", required = false)
    int years;

    @JsonProperty(value="現在住まい広さ", required = false)
    BigDecimal number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}


