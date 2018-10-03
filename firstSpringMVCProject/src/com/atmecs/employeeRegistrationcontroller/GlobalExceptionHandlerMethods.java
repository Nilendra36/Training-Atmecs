package com.atmecs.employeeRegistrationcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {
@ExceptionHandler(value=NullPointerException.class)
public String handleNullPointerException(Exception ex) {
	System.out.println("Exception: "+ex);
	return "NullPointerException";
}

@ExceptionHandler(value=ArithmeticException.class)
public String handleArithmeticException(Exception ex) {
	System.out.println("Exception "+ex);
	return "NullPointerException";
}

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
@ExceptionHandler(value=Exception.class)
public String handleRestException(Exception ex) {
	System.out.println("Exception "+ex);
	return "NullPointerException";
}

}

/*
 * This class will handle exception occurred in any of the Controller Class.
 * We don't need to write exception handling method in each of the controller class.
 */

