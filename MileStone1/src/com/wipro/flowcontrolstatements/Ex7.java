package com.wipro.flowcontrolstatements;

public class Ex7 {

	public static void main(String[] args) {
		String str1 = args[0];
		char a = str1.charAt(0);
		String str2 = args[1];
		char b = str2.charAt(0);
		if (a <b){
		System.out.println(a+","+b);
		}
		else{
		System.out.println(b+","+a);
		}

	}

}
