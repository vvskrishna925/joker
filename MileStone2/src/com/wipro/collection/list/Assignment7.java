package com.wipro.collection.list;
import java.util.*;
public class Assignment7 {
public static void main(String[] args) {
	List<Employee> list = new Vector<>();
	list.add(new Employee(101, "Bob", "bob@w3epic.com", "M", 25000));
	list.add(new Employee(102, "Alice", "alice@w3epic.com", "F", 30000));
	list.add(new Employee(103, "John", "john@w3epic.com", "M", 20000));
	list.add(new Employee(104, "Ram", "ram@w3epic.com", "M", 50000));
	Iterator<Employee> it = list.iterator();
	while (it.hasNext()) {
				System.out.println(it.next());
	}
}
}
