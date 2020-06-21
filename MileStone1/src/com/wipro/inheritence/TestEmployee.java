package com.wipro.inheritence;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Krishna");
		emp.setYearOfWorkStarted(2017);
		emp.setAnnualSalary(4.2);
		emp.setNationalInsuranceNumber("BN12FD932");
		emp.getEmployeedetails();
	}

}
