package miniProject2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeDetails implements Serializable{
	private int id;
	private String name;
	private int age;
	private int salary;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  id + " " + name + " " + age + " " + salary;
	}
	
}
