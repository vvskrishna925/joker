package com.wipro.collection.maps;

public class Assignment1 {
public static void main(String[] args) {
	CountryMap cm = new CountryMap();
	cm.saveCountryCaptial("India", "Delhi");
	cm.saveCountryCaptial("Japan", "Tokyo");
	System.out.println(cm.getCapital("India"));
	System.out.println(cm.getCapital("Japan"));
	System.out.println(cm.getCountryName("Delhi"));
	System.out.println(cm.swapKeyValue());
	System.out.println(cm.toArrayList());
}
}
