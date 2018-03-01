package com.hejia.api.exception.user;

/**
 * 
 * 异常类--数据不能使用
 */
public class UserException extends Exception {

    public UserException() {
        super();
    }

    public UserException(String message, Throwable cause,
                         boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(Throwable cause) {
        super(cause);
    }
}
