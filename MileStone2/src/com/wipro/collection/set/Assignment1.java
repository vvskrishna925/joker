package com.wipro.collection.set;

public class Assignment1 {
public static void main(String[] args) {
	Country c = new Country();
	c.saveCountryNames("India");
	c.saveCountryNames("China");
	c.saveCountryNames("Pakistan");
	c.saveCountryNames("USA");
	c.saveCountryNames("Russia");
	System.out.println(c.getCountry("China"));
	System.out.println(c.getCountry("Bangladesh"));
}
}
