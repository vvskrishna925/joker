package com.wipro.strings;
import java.util.*;
public class Assignment7 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	StringBuilder sb = new StringBuilder();
	if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
		sb.append(str.substring(1, str.length() - 1));
	}
	else if (str.charAt(0) == 'x') {
		sb.append(str.substring(1, str.length()));
	}
	else if (str.charAt(str.length() - 1) == 'x') {
		sb.append(str.substring(0, str.length() - 1));
	}
	else {
		sb.append(str);
	}
	System.out.println(sb);
	
}
}
