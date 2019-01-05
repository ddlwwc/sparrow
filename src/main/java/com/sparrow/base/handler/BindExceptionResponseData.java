package com.sparrow.base.handler;

/**
 * Created by wancheng on 2018/12/23.
 * 参数校验异常返回信息实体类
 */
public class BindExceptionResponseData {
    /**
     * 返回编码
     */
    private Integer code;
    /**
     * 访问的路径
     */
    private String url;
    /**
     * 返回信息
     */
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

    public BindExceptionResponseData setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public BindExceptionResponseData setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BindExceptionResponseData setMessage(String message) {
        this.message = message;
        return this;
    }
}
