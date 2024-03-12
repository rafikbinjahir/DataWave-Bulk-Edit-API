package com.example.employee.exceptionhandler;

public class RecordExceededException extends RuntimeException{
	public RecordExceededException(String message) {
		super(message);
	}

}
