package com.wanghang.projectsdk.base.model;

public enum CodeType {
    OK(0, "成功"),
    PARAMS_ERROR(1, "参数异常"),
    DATABASE_ERROR(2, "数据库异常"),
    SERVER_ERROR(3, "服务器异常"),
    BUSINESS_ERROR(4, "业务异常"),
    THIRD_ERROR(5, "第三方异常"),
    SYSTEM_ERROR(6, "系统异常");


    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    CodeType(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
