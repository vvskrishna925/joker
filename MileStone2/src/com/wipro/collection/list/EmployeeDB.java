package com.wipro.collection.list;

import java.util.*;

public class EmployeeDB {
	List <Employee> emp = new ArrayList<>();
	public boolean addEmployee(Employee e) {
		return emp.add(e);
	}
	public boolean deleteEmployee (int empId) {
		boolean deleted = false;
		Iterator<Employee> i = emp.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (empId == e.getEmpId()) {
				deleted = true;
				i.remove();
			}
		}
		return deleted;
	}
	public String showPaySlip (int empId) {
		String paySlip = "Invalid employee id";
		Iterator<Employee> i = emp.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (empId == e.getEmpId()) {
				paySlip = "payslip for employeeid " + empId + " is " + e.getSalary();
			}
		}
		return paySlip;
	}
	public Employee[] listAll() {
		Employee[] empArray = new Employee[emp.size()];
		for (int i = 0;i < emp.size();i++) {
			empArray[i] = emp.get(i);
		}
		return empArray;
	}
}
