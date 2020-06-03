package com.wanghang.projectsdk.base.model;

import com.wanghang.projectsdk.base.exception.ServiceException;
import lombok.Data;

/**
 * @author wanghang
 * 2020/4/28
 **/
@Data
public class Response<T> {
    private Integer code;
    private String message;
    private String notice;
    private T content;

    public Response(CodeType codeType) {
        this.code = codeType.getCode();
        this.message = codeType.getMessage();
        this.notice = codeType.getMessage();
    }

    public Response(CodeType codeType, String notice) {
        this(codeType);
        this.notice = notice;
    }

    public Response(ServiceException e) {
        this(e.getCodeType(), e.getMessage());
    }

    public Response(T content) {
        this(CodeType.OK);
        this.content = content;
    }
}
