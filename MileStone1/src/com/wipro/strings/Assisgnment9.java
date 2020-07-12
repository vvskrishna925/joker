package com.wipro.strings;
import java.util.*;
public class Assisgnment9 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	String result = "";
	if (str1.length() == str2.length()) {
		for (int  i = 0;i < str1.length();i++) {
				result += String.valueOf(str1.charAt(i));
				result += String.valueOf(str2.charAt(i));
		}
	}
	else if (str1.length() < str2.length()) {
		for (int  i = 0;i < str1.length();i++) {
				result += String.valueOf(str1.charAt(i));
				result += String.valueOf(str2.charAt(i));
		}
			result +=  str2.substring(str1.length());
}
	else {
		for (int  i = 0;i < str2.length();i++) {
				result += String.valueOf(str1.charAt(i));
				result += String.valueOf(str2.charAt(i));
		}
			result +=  str1.substring(str2.length());
	}
	System.out.println(result);
}
}