package com.wipro.flowcontrolstatements;

public class Ex17 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int sum = 0, n;
		while (a != 0) {
			n = a % 10 ;
			a = a / 10;
			sum = sum + n;
		}
		System.out.println(sum);
	}

}
