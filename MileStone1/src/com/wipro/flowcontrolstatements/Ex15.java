package com.wipro.flowcontrolstatements;

public class Ex15 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		boolean prime = true;
		for ( int i = 2; i <= (n/2); i++) {
			if (n % i == 0) {
			prime = false;
			break;
		}
	}
		if (prime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
}
}
