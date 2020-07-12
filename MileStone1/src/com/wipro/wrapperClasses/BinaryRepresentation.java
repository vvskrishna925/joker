package com.wipro.wrapperClasses;
import java.util.*;
public class BinaryRepresentation {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	System.out.println(String.format("%8s",Integer.toBinaryString(number)).replace(" ","0"));
}
}
