package com.wipro.flowcontrolstatements;

public class Ex4b {
 public static void main(String[] args) {
	 int a = Integer.parseInt (args[0]);
	 int b = Integer.parseInt (args[1]);
	 int c = (  a % 10);
	 int d = (b % 10);
	 if ( c == d){
	 System.out.println("True");
	 }
	 else{
	 System.out.println("False");
	 }
}
}
