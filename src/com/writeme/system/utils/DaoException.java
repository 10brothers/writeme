package com.writeme.system.utils;

public class DaoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}
	
	public DaoException(Throwable exception){
		super(exception);
	}
	
	public DaoException(String errorMessage){
		super(errorMessage);
	}
	
	public DaoException(Throwable throwable,String message){
		super(message, throwable);
	}
}
