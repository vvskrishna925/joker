package com.wipro.strings;
import java.util.*;
public class Assignment8 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	StringBuilder sb = new StringBuilder(str);
	for (int i = 0;i < str.length();i++) {
		if (i == 0 && str.charAt(i) == '*') {
			sb.delete(i, i + 1);
		}
		else if ((i > 0 && i < str.length() - 1) && str.charAt(i) == '*') {
			sb.delete(i - 1, i + 2);
		}
		else if (i == str.length() - 1 && str.charAt(i) == '*') {
			sb.delete(i - 1, str.length());
		}
	}
	System.out.println(sb);
}
}
