package com.hejia.api.exception.core;

/**
 * 
 * 异常类--参数不合法
 */
public class ParamIllegalException extends Exception {

    public ParamIllegalException() {
        super();
    }

    public ParamIllegalException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ParamIllegalException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamIllegalException(String message) {
        super(message);
    }

    public ParamIllegalException(Throwable cause) {
        super(cause);
    }
}
