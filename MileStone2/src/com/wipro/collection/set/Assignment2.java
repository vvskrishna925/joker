package com.wipro.collection.set;
import java.util.*;
public class Assignment2 {
public static void main(String[] args) {
	Set<String> emp = new HashSet<>();
	emp.add("Alice");
	emp.add("bob");
	emp.add("rob");
	emp.add("ross");
	emp.add("rose");
	Iterator<String> it = emp.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
}
}
