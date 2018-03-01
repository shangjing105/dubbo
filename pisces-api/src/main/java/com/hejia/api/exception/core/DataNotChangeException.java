package com.hejia.api.exception.core;

/**
 * 
 * 异常类--数据没有变化
 */
public class DataNotChangeException extends Exception {

	public DataNotChangeException() {
		super();
	}

	public DataNotChangeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataNotChangeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataNotChangeException(String message) {
		super(message);
	}

	public DataNotChangeException(Throwable cause) {
		super(cause);
	}

}
