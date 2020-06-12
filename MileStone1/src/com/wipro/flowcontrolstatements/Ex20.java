package com.wipro.flowcontrolstatements;

public class Ex20 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = 0, n = a, t;
		while (a != 0) {
			t = a % 10 ;
			a = a / 10;
			b = (b * 10) + t;
		}
		if (b == a) {
			System.out.println(n+" is a palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}
	}

}
