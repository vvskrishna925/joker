package com.wipro.objectSerialization;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class ObjectSerialization {
@SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	System.out.print("Enter name: ");
	emp.setName(sc.nextLine());
	System.out.print("Enter D.O.B.: ");
	emp.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()));
	System.out.print("Enter department: ");
	emp.setDepartment(sc.nextLine());
	System.out.print("Enter designation: ");
	emp.setDesignation(sc.nextLine());
	System.out.print("Enter salary: ");
	emp.setSalary(sc.nextDouble());
	sc.nextLine();
	FileOutputStream fos = new FileOutputStream("data.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(emp);
	FileInputStream fis = new FileInputStream("data.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Employee emp2 = (Employee) ois.readObject();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Name: " + emp2.getName());
	System.out.println("D.O.B.: " + formatter.format(emp2.getDateOfBirth()));
	System.out.println("Department: " + emp2.getDepartment());
	System.out.println("Designation: " + emp2.getDesignation());
	System.out.println("Salary: " + emp2.getSalary());
}
}
