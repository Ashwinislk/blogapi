package com.bikkadIt.BlogApplication.exception;

public class ResourceNotFound extends RuntimeException {

	
	String msg;

	public ResourceNotFound(String msg) {
		super(msg);
		this.msg = msg;
	}

	
	
}
