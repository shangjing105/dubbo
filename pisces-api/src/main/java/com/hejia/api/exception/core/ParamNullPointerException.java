package com.hejia.api.exception.core;

/**
 * 
 * 异常类--参数空指针
 */
public class ParamNullPointerException extends Exception {

    public ParamNullPointerException() {
        super();
    }

    public ParamNullPointerException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ParamNullPointerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamNullPointerException(String message) {
        super(message);
    }

    public ParamNullPointerException(Throwable cause) {
        super(cause);
    }
}
