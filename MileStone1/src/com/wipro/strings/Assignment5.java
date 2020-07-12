package com.wipro.strings;
import java.util.*;
public class Assignment5 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	System.out.println(str.substring(1, str.length() - 1));
}
}
