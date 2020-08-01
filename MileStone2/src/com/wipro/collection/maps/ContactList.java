package com.wipro.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class ContactList {
	HashMap<String, Integer> contacts = new HashMap<>(); 
	public void addContact (String name, Integer number) {
		contacts.put(name, number);
	}
	public boolean doesContactNameExist(String name) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> map = it.next();
			
			if (map.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	public boolean doesContactNumberExist(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();

			if (me.getValue().intValue() == number) {
				
				return true;
			}
		}
		
		return false;
	}
	public void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
}
}
