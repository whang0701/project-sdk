package com.wanghang.projectsdk.base.exception;

import com.wanghang.projectsdk.base.model.CodeType;

/**
 * @author wanghang
 * 2020/6/1
 **/
public class ServiceException extends RuntimeException {
    private final CodeType codeType;

    public ServiceException(CodeType codeType, String message) {
        super(message);
        this.codeType = codeType;
    }

    public ServiceException(CodeType codeType) {
        super(codeType.getMessage());
        this.codeType = codeType;
    }

    public CodeType getCodeType() {
        return codeType;
    }
}
