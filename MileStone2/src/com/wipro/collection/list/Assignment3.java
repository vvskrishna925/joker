package com.wipro.collection.list;
import java.util.*;
public class Assignment3 {
public void printAll (List<String> list) {
	Iterator<String> it = list.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
}
public static void main(String[] args) {
	Assignment3 a = new Assignment3();
	List<String> list = new ArrayList<>();
	list.add("Element 1");
	list.add("Element 2");
	list.add("Element 3");
	list.add("Element 4");
	list.add("Element 5");
	a.printAll(list);
}
}
