package edu.iot.controller_test.exception;

public class LoginFailException extends Exception {
	
	public LoginFailException() {}
	public LoginFailException(String message) {
		super(message);
	}
}
