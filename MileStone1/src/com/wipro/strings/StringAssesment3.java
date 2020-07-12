package com.wipro.strings;

import java.util.Scanner;

public class StringAssesment3 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int strLen = str.length();
	str = str.substring(0, 2);
	String str1 ="";
	for(int i = 0;i < strLen;i++) {
		str1 += str;
	}
	System.out.println(str1);
}
}
