package com.hejia.api.exception.core;

/**
 * 
 * 异常类--数据不能使用
 */
public class DataCanNotUseException extends Exception {

    public DataCanNotUseException() {
        super();
    }

    public DataCanNotUseException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataCanNotUseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataCanNotUseException(String message) {
        super(message);
    }

    public DataCanNotUseException(Throwable cause) {
        super(cause);
    }
}
