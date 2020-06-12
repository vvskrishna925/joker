package com.wipro.flowcontrolstatements;

public class Ex10 {

	public static void main(String[] args) {
     char c = args[0].charAt(0);
     if (c >=97 && c<= 122) {
             System.out.println( Character.toUpperCase(c));
	}
     else {
    	 System.out.println( Character.toLowerCase(c));
     }
	}
}
