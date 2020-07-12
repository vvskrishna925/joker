package com.wipro.wrapperClasses;
class Employee implements Cloneable {
	private String name;
	public Employee (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		}
		catch (Exception e) {
			System.out.println("Clone is allowed");
			return this;
		}
	}
}

public class Clon {
public static void main(String[] args) {
	Employee e =  new Employee ("Krishna");
	Employee eclone = e.clone();
	eclone.setName("Vvs Krishna");
	System.out.println(eclone.getName());
	System.out.println(e.getName());
}
}
