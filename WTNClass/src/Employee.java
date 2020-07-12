import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {
int empno;
String empname;
Employee(int empno, String empname){
	this.empname = empname;
	this.empno = empno;
}
//@Override
//public String toString() {
//	return "Employee [empno=" + empno + ", empname=" + empname + "]";
//}
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee e = new Employee(9853722,"Krishna");
	//System.out.println(e);
	// Serialization
	FileOutputStream fo = new FileOutputStream("abc.txt");	
	ObjectOutputStream ob = new ObjectOutputStream(fo);
	ob.writeObject(e);
	ob.close();
	// DeSerialization
	FileInputStream fi = new FileInputStream("abc.txt");	
	@SuppressWarnings("resource")
	ObjectInputStream io = new ObjectInputStream(fi);
	Employee e1 = (Employee)io.readObject();	
	// the obj info is stream type so we need to typecasting into class obj
	System.out.println(e1.empno + " "+e1.empname);
}
}
