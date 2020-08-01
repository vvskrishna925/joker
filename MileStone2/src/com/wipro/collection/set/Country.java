package com.wipro.collection.set;
import java.util.*;
public class Country {
	Set<String> H1 = new HashSet<>();
	public Set<String> 	saveCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}
	public String getCountry (String CountryName) {
		Iterator<String> it = H1.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName)) {
				return CountryName;
			}
			
		}
		return null;
	}
}
