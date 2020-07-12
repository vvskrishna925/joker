package com.wipro.strings;
import java.util.*;
public class Assignment6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.length() < str2.length()) {
			System.out.println(str1 + str2 + str1);
		}
		else {
			System.out.println(str2 + str1 + str2);
		}
	}
}
