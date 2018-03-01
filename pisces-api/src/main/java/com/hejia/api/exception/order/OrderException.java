package com.hejia.api.exception.order;

/**
 * 
 * 异常类--数据不能使用
 */
public class OrderException extends Exception {

    public OrderException() {
        super();
    }

    public OrderException(String message, Throwable cause,
                          boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }
}
