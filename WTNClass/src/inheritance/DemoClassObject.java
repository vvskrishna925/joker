package inheritance;
class Object {
	protected int i;
	 void set(int y) {
		i = y;
	}
	  void show() {
		System.out.println(i);
	}
}
public class DemoClassObject {
	// instance variables
	public int j ;
	double d;
	public static void main(String[] args) {
		DemoClassObject dco = new DemoClassObject();
		DemoClassObject dco1 = new DemoClassObject();
		// . indicates inside
		// Note : Never write the data of object in main 
		// any instance variables should be accessed by object only
		// public can be accessed from anywhere
		// private can access within the class
		// protected can access within the package
		Object o = new Object();
		o.set(78);
		o.i = 79;
		o.show();
		dco.j = 98;
		dco.d = 12.987;
		System.out.println(dco.j);
		System.out.println(dco1.j); 
		}
}
