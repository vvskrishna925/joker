package com.wipro.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class Assignment2 {
public static void main(String[] args) {
	HashMap<String,String> map = new HashMap<>();
	map.put("India", "Delhi");
	map.put("Japan", "Tokyo");
	map.put("Bangladesh", "Dhaka");
	Set<Entry<String, String>> set = map.entrySet();
	Iterator<Entry<String, String>> it = set.iterator();
	String key = "Japan";
	String value = "Delhi";
	boolean isKey = false;
	boolean isValue = false;
	while(it.hasNext()) {
		Map.Entry<String, String> m = it.next();
		if(key.equals(m.getKey())) {
			isKey = true;
		}
		if(value.equals(m.getValue())) {
			isValue = true;
		}
	}
	if (isKey) {
		System.out.println("key " + key + " exits");
	}
	else {
		System.out.println("key " + key + " not exits");
	}
	if (isValue) {
		System.out.println("value " + value + " exits");
	}
	else {
		System.out.println("value "  + value + " not exits");
	}
}
}
