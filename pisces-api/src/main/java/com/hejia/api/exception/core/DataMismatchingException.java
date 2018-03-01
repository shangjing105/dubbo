package com.hejia.api.exception.core;

/**
 * 
 * 异常类--数据不匹配
 */
public class DataMismatchingException extends Exception {

	public DataMismatchingException() {
		super();
	}

	public DataMismatchingException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataMismatchingException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataMismatchingException(String message) {
		super(message);
	}

	public DataMismatchingException(Throwable cause) {
		super(cause);
	}

}
