package com.wipro.exceptionhandling;

@SuppressWarnings("serial")
public class NegativeValuesException extends Exception {
	 NegativeValuesException() {
		System.out.println("Negative value exception");
	}
}
