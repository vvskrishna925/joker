package com.wipro.classesandobjects;

public class Calculator {
	static int num1;
	static int num2;
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1,num2); // type casting double into integer
	}
	static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		System.out.println("Integer power " + powerInt(2,3));
		System.out.println("Double power " + powerDouble(2.5,3)); 
	}
}
