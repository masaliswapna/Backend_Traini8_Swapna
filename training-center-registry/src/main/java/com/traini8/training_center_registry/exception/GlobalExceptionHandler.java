
package com.traini8.training_center_registry.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
	        String errorMessage = ex.getBindingResult().getFieldError().getDefaultMessage();
	        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleGlobalExceptions(Exception ex, WebRequest request) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
