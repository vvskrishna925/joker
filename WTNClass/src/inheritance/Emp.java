package inheritance;
class Person1 {
		Person1 (int no ) {
		System.out.print(no + " : Hello ");
	}
}
class Employee1 extends Person1 {
	 Employee1(int no){
		  super(no);
		  System.out.println("Krishna");
	 } 
}
public class Emp {

	public static void main(String[] args) {
		Employee1 e = new Employee1(19);
		if (e instanceof Employee1) {
			System.out.println("e belongs to employee");
		}
		if (e instanceof Person1) {
			System.out.println("e belongs to person"); // as employee1 is child of person1 and employee1 has properties of person1 so e also belongs to person1 also 
		}
		else {
			System.out.println("e doesn't belongs to person");
		}
	}

}
