package concept;
// the order of execution of the constructors in inheritance is from base class to derived class
class A{
	A(){
		System.out.println("A constructor");
	}
	}
class B extends A {
	B(){
		System.out.println("B constructor");
	}
}
class C extends B {
	C(){
		System.out.println("C contructor");
	}
}
public class Sindemocon {

	public static void main(String[] args) {
		C b = new C();
	}

}
