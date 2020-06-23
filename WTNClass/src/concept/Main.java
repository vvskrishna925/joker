package concept;
// java profiler is the one which monitors JVM. if JVM is executing in a correct way or not.
class AA {
	void M() {
		System.out.println("Hi");
	}
	{
		System.out.println(" in AA ");
	}
	// this initialization block will be taken as the default constructor
	// if default constructor exist then the initialization block data will copied
	// into the default constructor as the first statement
	}
class BB extends AA{
	BB( int a){
		System.out.println("in b value is " + a);
	}
	{
		System.out.println(" Demo in BB");
	}
	void N() {
		System.out.println("Hello");
	}
}
public class Main {
public static void main(String[] args) {
	BB b = new BB(12);
	// AA a = new AA();
	// b can access M() , N()
	// a can access M()
	// BB c = new AA();  // downcasting ( child --> bringing ref of the parent(X))
	// cannot convert AA to BB
	//AA d = new BB(); // upcasting (parent --> bringing ref of child(x)) superclass obj = new subclass ();
	//d.M(); 
	b.M();
	b.N();	
}
}
