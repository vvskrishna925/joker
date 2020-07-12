package com.wipro.strings;

import java.util.Scanner;

public class Assessment4 {
	public String halfOfString(String str) {
		if (str.length() % 2 != 0) {
			return "null";
		}
		return str.substring(0, str.length()/2);
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Assessment4 a = new Assessment4();
		System.out.println(a.halfOfString(str));
	}
}
