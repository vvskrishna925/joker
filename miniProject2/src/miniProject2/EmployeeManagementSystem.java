package miniProject2;
import java.util.*;
import java.io.*;
public class EmployeeManagementSystem {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Scanner sc = new Scanner(System.in);
	boolean loop = true;
	int choice = 0;
	FileOutputStream fos = new FileOutputStream ("Employee.txt");
	ObjectOutputStream oos = new ObjectOutputStream (fos);
	while (loop) {
		System.out.println("Main Menu");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			EmployeeDetails emp = new EmployeeDetails();
			System.out.println("Enter Employee ID: ");
			emp.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Employee Name: ");
			emp.setName(sc.nextLine());
			System.out.println("Enter Employee Age: ");
			emp.setAge(sc.nextInt());
			System.out.println("Enter Employee Salary");
			emp.setSalary(sc.nextInt());
			oos.writeObject(emp);
			break;
		case 2:
			FileInputStream fis = new FileInputStream ("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			System.out.println("----Report----");
			EmployeeDetails emp1 = new EmployeeDetails ();
			while (fis.available() > 0) {
				emp1 = (EmployeeDetails) ois.readObject();
				System.out.println(emp1.toString());
			}
			System.out.println("----End of Report----");
			fis.close();
			ois.close();
			break;
		case 3:
			System.out.println("Exiting the System");
			loop = false;
			break;
		}
	}
	oos.close();
	fos.close();
	sc.close();
}
}
