package com.wipro.exceptionhandling;

@SuppressWarnings("serial")
public class ValueOutOfRangeException extends Exception {
	ValueOutOfRangeException(){
		System.out.println("value out of range exception");
	}
}
