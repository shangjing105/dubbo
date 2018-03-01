package com.hejia.api.exception.core;

/**
 * 数据一致异常
 */
public class DataConsistencyException extends Exception{
	public DataConsistencyException() {
        super();
    }

    public DataConsistencyException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataConsistencyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataConsistencyException(String message) {
        super(message);
    }

    public DataConsistencyException(Throwable cause) {
        super(cause);
    }
}
