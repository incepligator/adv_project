package com.guffy.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException() {

	}

	public DataNotFoundException(String arg0) {
		super(arg0);

	}

	public DataNotFoundException(Throwable arg0) {
		super(arg0);

	}

	public DataNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public DataNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);

	}

}
