package com.lockedme.exceptionhandler;

public class LockedMeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2221653488163711045L;

	public LockedMeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LockedMeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public LockedMeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LockedMeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LockedMeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
