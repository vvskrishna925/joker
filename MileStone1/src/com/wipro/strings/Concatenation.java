package com.wipro.strings;

import java.util.Scanner;

public class Concatenation {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine().toLowerCase();
	String str2 = sc.nextLine().toLowerCase();
	StringBuilder sb = new StringBuilder(str1);
	if(str1.charAt(str1.length() - 1) == str2.charAt(0)) {
		sb.append(str2.substring(1));
	}
	else {
		sb.append(" ");
		sb.append(str2);
	}
	System.out.println(sb);
}
}
