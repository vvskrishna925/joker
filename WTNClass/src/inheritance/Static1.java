package inheritance;

public class Static1 {
	// static variable
	static int j = n();
	// static block
	static {
		System.out.println("Inside the static block");
	}
	// static method 
	 static int n() {
		System.out.println("From n...");
		return 30;
	} 
	// static(main!!)
	public static void main(String[] args) {
		System.out.println("Value of j is " + j);
		System.out.println("Inside the main method");
	}

}
