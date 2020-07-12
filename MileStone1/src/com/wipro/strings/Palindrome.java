package com.wipro.strings;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder st = new StringBuilder(str);
		st.reverse();
		if(str.contentEquals(st)) {
			System.out.println( str + " is palindrome ");
		}
		else {
			System.out.println( str + " is not palindrome ");
		}
	}
}
