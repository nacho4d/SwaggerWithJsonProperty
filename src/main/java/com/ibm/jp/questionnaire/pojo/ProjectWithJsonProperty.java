package com.ibm.jp.questionnaire.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectWithJsonProperty {

    @JsonProperty(value="projectName", required = true)
    String name;

    @JsonProperty(value="完了", required = true)
    boolean finished;

    @JsonProperty(value="number-of-years", required = false)
    int years;

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
}


