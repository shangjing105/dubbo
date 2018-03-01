package com.hejia.api.exception.core;

/**
 * 
 * 异常类--数据已经存在
 */
public class DataExistedException extends Exception {

    public DataExistedException() {
        super();
    }

    public DataExistedException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataExistedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataExistedException(String message) {
        super(message);
    }

    public DataExistedException(Throwable cause) {
        super(cause);
    }
}
