package com.bikkadIt.BlogApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.bikkadIt.BlogApplication.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ApiResponse> resourceNotFound(ResourceNotFound ex) {
		ApiResponse api=new ApiResponse();
		api.setMsg(ex.getMessage());
		api.setStatus(false);
		
		return new ResponseEntity<ApiResponse>(api,HttpStatus.NOT_FOUND);
		
	}
	

}
