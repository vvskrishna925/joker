package com.wipro.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class CountryMap2 {
	Hashtable<String,String> M1 = new Hashtable<>();
	public Hashtable<String,String> saveCountryCaptial (String CountryName, String Capital){
		 M1.put(CountryName, Capital);
		 return  M1;
	}
	public String getCapital(String CountryName) {
			return M1.get(CountryName);
	}
	public String getCountryName(String Capital) {
		Set<Entry<String, String>> s = M1.entrySet();
		Iterator<Entry<String, String>> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> map =  it.next();
			if (map.getValue().equals(Capital)) {
				return map.getKey();
			}
		}
		return null;
}
	public Hashtable<String, String> swapKeyValue(){
		Set<Entry<String, String>> s = M1.entrySet();
		Iterator<Entry<String, String>> it = s.iterator();
		Hashtable<String, String> M2 = new Hashtable<>();
		while (it.hasNext()) {
			Map.Entry<String, String> map = it.next();
			M2.put(map.getValue(), map.getKey());
		}
		return M2;
	}
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		Set<Entry<String, String>> s = M1.entrySet();
		Iterator<Entry<String, String>> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> map = it.next();
			list.add(map.getKey());
		}
		return list;
	}
}
