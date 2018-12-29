package com.sparrow.base.handler;

/**
 * Created by wancheng on 2018/12/23.
 */
public class BindExceptionResponseData {

    private Integer code;
    private String url;
    private String message;

    public BindExceptionResponseData() {
    }

    public BindExceptionResponseData(Integer code, String url, String message) {
        this.code = code;
        this.url = url;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
