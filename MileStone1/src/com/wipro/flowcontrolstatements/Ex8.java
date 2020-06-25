package com.wipro.flowcontrolstatements;

public class Ex8 {

	public static void main(String[] args) {
			String str = args[0];
			char a = str.charAt(0);
			if ((a >= 65 && a <= 90) || (a >=97 &&  a <= 122 )){
			System.out.println("Alphabhet");
			}
			else if (a >= 48 && a <= 57) {
				System.out.println("Digit");
			}
			else{
			System.out.println("Special Character");
			}

	}

}
