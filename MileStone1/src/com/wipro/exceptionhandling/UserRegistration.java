package com.wipro.exceptionhandling;

public class UserRegistration {
	void registerUser(String username,String userCountry) throws Exception {
		if (userCountry.contentEquals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException();
		}
	}
public static void main(String[] args) {
	UserRegistration ur = new UserRegistration();
	try {
		ur.registerUser("Mickey", "India");
	} catch (Exception e) {
		e.getMessage();
	}
}
}
