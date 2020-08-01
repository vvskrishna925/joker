package com.wipro.collection.maps;

public class Assignment5 {
public static void main(String[] args) {
	CountryMap1 cm = new CountryMap1();
	cm.saveCountryCaptial("India", "Delhi");
	cm.saveCountryCaptial("Japan", "Tokyo");
	System.out.println(cm.getCapital("India"));
	System.out.println(cm.getCapital("Japan"));
	System.out.println(cm.getCountryName("Delhi"));
	System.out.println(cm.swapKeyValue());
	System.out.println(cm.toArrayList());
}
}
