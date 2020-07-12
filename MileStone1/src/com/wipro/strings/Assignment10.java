package com.wipro.strings;
import java.util.*;
public class Assignment10 {
	public String nRepitations(String str,int n) {
		String result = "";
		for (int i = 0;i < n;i++) {
			result += str.substring(str.length() - n);
		}
		return result;
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int n = sc.nextInt();
	Assignment10 a = new Assignment10();
	System.out.println(a.nRepitations(str, n));
}
}
