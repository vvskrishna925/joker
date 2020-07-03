package com.wipro.exceptionhandling;
import java.util.*;
public class StudentMarks {
	public static void main(String[] args) throws Exception  {
		@SuppressWarnings("resource")
		Scanner ob = new Scanner(System.in);
		String name = "";
		int sub1 = 0;
		int sub2 = 0;
		int sub3 = 0;
		for (int i = 0;i < 2;i++) {
			try {
				name = ob.nextLine();
				sub1 = Integer.parseInt(ob.nextLine());
				sub2 = Integer.parseInt(ob.nextLine());
				sub3 = Integer.parseInt(ob.nextLine());
				if (sub1 < 0) {
					throw new NegativeValuesException();
				}
				if (sub1 > 100) {
					throw new ValueOutOfRangeException();
				}
				if (sub2 < 0) {
					throw new NegativeValuesException();
				}
				if (sub2 > 100) {
					throw new ValueOutOfRangeException();
				}
				if (sub3 < 0) {
					throw new NegativeValuesException();
				}
				if (sub3 > 100) {
					throw new ValueOutOfRangeException();
				}
			}
			catch (NumberFormatException e) {
				System.out.println("NumberFormatException");
			}
			catch (NegativeValuesException e) {
				e.getMessage();
			}
			catch (ValueOutOfRangeException e) {
				e.getMessage();
			}
			System.out.println("Name: " + name);
			System.out.println("Marks of subject 1: " + sub1);
			System.out.println("Marks of subject 2: " + sub2);
			System.out.println("Marks of subject 3: " + sub3);
		}
	}
}
