package com.wipro.collection.set;

public class Assignment4 {
	public static void main(String[] args) {
		Country1 c = new Country1();
		c.saveCountryNames("India");
		c.saveCountryNames("China");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("USA");
		c.saveCountryNames("Russia");
		System.out.println(c.getCountry("China"));
		System.out.println(c.getCountry("Bangladesh"));
	}
}
