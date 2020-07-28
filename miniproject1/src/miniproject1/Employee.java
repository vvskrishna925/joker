package miniproject1;
@SuppressWarnings("serial")
class InvalidEmployeeIdException extends Exception
{
	InvalidEmployeeIdException(String s)
	{
		super(s);
	}
}
public class Employee {
	// (Dear Allowance) DesignationTable
	private String[][] designationTable = new String [][] {
	//    0       1         2
		{"e", "Engineer", "2000"},  //      0
		{"c", "Consultant", "32000"},  //   1
		{"k", "Cleark", "12000"},  //       2
		{"r", "Receptionist", "15000"},  // 3
		{"m", "Manager", "40000"}//         4
	};
	// EmplooyeeDetails 
	private String[][] employeeTable = new String [][] {
	//      0       1          2          3    4        5       6       7
		{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"}, //        0
		{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"}, //        1
		{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"}, //        2
		{"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},//  3
		{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"}, //     4
		{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},//  5
		{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"} //        6
	};
	// to get DearAllowance 
	public int getDearAllowance(String s) {
		switch(s) {
		case "e":
			return Integer.parseInt(designationTable[0][2]);
		case "c":
			return Integer.parseInt(designationTable[1][2]);
		case "k":
			return Integer.parseInt(designationTable[2][2]);
		case "r":
			return Integer.parseInt(designationTable[3][2]);
		case "m":
			return Integer.parseInt(designationTable[4][2]);
		default:
			return 0;
		}
	}
	// to get Designation
	public String getDesignation (String s) {
		switch (s) {
		case "e":
			return designationTable[0][1];
		case "c":
			return designationTable[1][1];
		case "k":
			return designationTable[2][1];
		case "r":
			return designationTable[3][1];
		case "m":
			return designationTable[4][1];
		default :
			return "";
		}
	}
	// to get salary of the employee
	public int getSalary (int basic, int hra, int it, int da) {
		return basic + hra + it - da;
	}
	// print employee details
	public void printEmployeeDetails(int id) throws InvalidEmployeeIdException {
		int empNo, salary;
		 String empName, department, designation; 
		for (int i = 0; i < employeeTable.length;i++) {
			if (id == Integer.parseInt(employeeTable[i][0])) {
				empNo = id;
				empName = employeeTable[i][1];
				department = employeeTable[i][4];
				designation = getDesignation(employeeTable[i][3]);
				salary = getSalary(Integer.parseInt(employeeTable[i][5]),Integer.parseInt(employeeTable[i][6]),Integer.parseInt(employeeTable[i][7]),getDearAllowance(employeeTable[i][4]));
				System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
				System.out.printf("%-10s%-10s%-15s%-15s%-10s", empNo, empName, department, designation, salary);
				return;
			}
		}
		throw new InvalidEmployeeIdException ("There is no employee with empid :" + id);
	}
public static void main(String[] args) {
	try {
		Employee e = new Employee();
		e.printEmployeeDetails(Integer.parseInt(args[0]));
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}

