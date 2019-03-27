package com.hcl.exceptions;

public class InvalidUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidUserException() {
		super("Invalid user");
		
	}

	public InvalidUserException(String message) {
		super(message);
		
	}
	

}
