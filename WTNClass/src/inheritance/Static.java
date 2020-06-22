package inheritance;

public class Static {
	static int j = 100, r; // static variable
	int n = 200; // instance variable
	static void a() {
		j = 200;
		System.out.println("printing from a j = " + j);
		// j = 400;
		//	n = 300; //cannot make static reference to non-static field n
	//	 a2(); // cannot make static reference to non-static method a2() from the type static
	}
	static {
		System.out.println("Static block initailized...");
		r = j * 9;
	}
	void a2() {
		 j = 300;
		System.out.println("printing from a2 n = " + n + " and " + j);
		a();
			}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		System.out.println("Value of j = " + j);
		System.out.println("Value of r = " + r);
		a();
		System.out.println("Static method");
		Static ob = new Static();
		ob.a2();
		System.out.println("Non-Static method");
	}

}
