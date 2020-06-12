package com.wipro.flowcontrolstatements;

public class Ex9 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[1]);
		char g = args[0].charAt(0); 
		if ( (g == 'F' )&& ( a  >= 1 && a <= 58)){
		System.out.println("the percentage of  interest is 8.2%");
		}
		else if ( (g == 'F' )&& ( a  >= 59 && a <= 100)){
		System.out.println("the percentage of  interest is 9.2%");
		}
		else if ( (g == 'M' )&& ( a  >= 1 && a <= 58)){
		System.out.println("the percentage of  interest is 8.4%");
		}
		else {
		System.out.println("the percentage of  interest is 10.5%");
		}
	}

}
