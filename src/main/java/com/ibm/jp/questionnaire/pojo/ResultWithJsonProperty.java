package com.ibm.jp.questionnaire.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultWithJsonProperty {

    @JsonProperty(value="カスタムメッセージ", required = true)
    String message;

    @JsonProperty(value = "ERROR_CODE", required = false)
    int code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
