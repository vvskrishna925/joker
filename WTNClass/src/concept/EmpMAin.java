package concept;
//super keyword usage
class Person {
	int no = 50;
	void display () {
		System.out.println("Hello person");
	}
}
class Employee extends Person {
	int no = 60;
	// no = 50 , no = 60
	// when there is a name collisions priority will be given to child class 
	// so to access parent class variable we use super
	void display() {		
		System.out.println("parent class property : " +super.no); // super under provision of variable
		System.out.println("child class property :" + no);
		System.out.println("Hello Employee");
		super.display(); // under the provision of method
	}
	// Super should be used only in method
	void show () {
		System.out.println("showing...");
		display();
	}
}
public class EmpMAin {

	public static void main(String[] args) {
		Employee e = new Employee();
		//e.display();
		e.show();
	}

}
