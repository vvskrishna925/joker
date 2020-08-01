package com.wipro.collection.set;
import java.util.*;
public class Assignment3 {
public static void main(String[] args) {
	Set<String> set = new TreeSet<>(Collections.reverseOrder());
	set.add("alice");
	set.add("duck");
	set.add("chuck");
	set.add("elephant");
	set.add("rose");
	System.out.println(set);
	Iterator<String> it = set.iterator();
	String query = "chuck";
	boolean isThere = false;
	while (it.hasNext()) {
		if (query.equals(it.next())) {
			isThere = true;
			break;
		}
	}
	if (isThere) {
		System.out.println(query + " exists");
	}
	else {
		System.out.println(query + " not exists");
	}
}
}
