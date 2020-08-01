package com.wipro.collection.list;

public class Assignment2 {
public static void main(String[] args) {
	EmployeeDB empdb = new EmployeeDB();
	Employee emp1 = new Employee(101, "Bob", "bob@w3epic.com", "M", 25000);
	Employee emp2 = new Employee(102, "Alice", "alice@w3epic.com", "F", 30000);
	Employee emp3 = new Employee(103, "John", "john@w3epic.com", "M", 20000);
	Employee emp4 = new Employee(104, "Ram", "ram@w3epic.com", "M", 50000);
	empdb.addEmployee(emp1);
	empdb.addEmployee(emp2);
	empdb.addEmployee(emp3);
	empdb.addEmployee(emp4);
	for (Employee emp : empdb.listAll()) {
		emp.getEmployeeDetails();
	}
	System.out.println();
	empdb.deleteEmployee(103);
	for (Employee emp : empdb.listAll()) {
		emp.getEmployeeDetails();
	}
	System.out.println();
	System.out.println(empdb.showPaySlip(104));
}
}
