package com.hejia.api.exception.core;

/**
 * 
 * 异常类--数据未找到
 */
public class DataNotFoundException extends Exception {

    public DataNotFoundException() {
        super();
    }

    public DataNotFoundException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataNotFoundException(String message) {
        super(message);
    }

    public DataNotFoundException(Throwable cause) {
        super(cause);
    }
}
