package com.wipro.exceptionhandling;
import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size = Integer.parseInt(s.nextLine());
		int index;
		int[] array = new int[size];
		try {
			System.out.println("Enter the elements in the array");
			for (int i = 0;i < size;i++) {
				array[i] = Integer.parseInt(s.nextLine());
			}
			System.out.println("Enter the index of the array element you want to access");
			 index = Integer.parseInt(s.nextLine());
			 System.out.println("The array element at the index "+ index +" = "+array[index]);
			 System.out.println("The array element succesfully accessed");
		}
		catch (NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		
	}
}
