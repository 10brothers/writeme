package com.writeme.system.utils;

public class ServiceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(){
		super();
	}
	
	
	public ServiceException(String message){
		super(message);
	}
	
	public ServiceException(Throwable throwable){
		super(throwable);
	}
	
	public ServiceException(Throwable throwable,String message){
		super(message, throwable);
	}
}
