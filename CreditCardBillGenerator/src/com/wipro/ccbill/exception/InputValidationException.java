package com.wipro.ccbill.exception;

@SuppressWarnings("serial")
public class InputValidationException extends Exception{

	@Override
	public String toString() {
		return "Invalid Input Data";
	}

}
