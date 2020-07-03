package com.wipro.exceptionhandling;

public class PersonDetails {
	public static void main(String[] args) {
		String name = "";
		int age = 0;
		try {
			name = args[0];
			age = Integer.parseInt(args[1]);
			if (age >= 18 && age < 60) {
				System.out.println("Name: "+ name);
				System.out.println("Age: "+age);
			}
			else {
				throw new AgeException();
			}
		}
		catch (Exception e) {
			e.getMessage();
		}
}
}
