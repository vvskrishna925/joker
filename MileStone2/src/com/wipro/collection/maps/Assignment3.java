package com.wipro.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class Assignment3 {
public static void main(String[] args) {
	Properties prop = new Properties();
	prop.setProperty("AndhraPradesh", "Amaravati");
	prop.setProperty("Telangana", "Hyderabad");
	prop.setProperty("TamilNadu", "Chennai");
	prop.setProperty("Maharastra", "Mumbai");
	Set<Entry<Object, Object>> set = prop.entrySet();
	Iterator<Entry<Object, Object>> it =set.iterator();
	while (it.hasNext()) {
		Map.Entry<Object, Object> map = it.next();
		System.out.println(map.getKey() + " : " + map.getValue() );
	}
}
}
