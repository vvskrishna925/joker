package concept;

public class StaticDemo {
	private static int a = 0;
	private int b;
	// static blocks can be anywhere in the class and they can be any numbers 
	// they execute in the order of appearance 
	// they start executing when class is loaded into JVM
	static {
		System.out.println("Hello...");
	}
	public void set(int i,int j) {
		a = i; b = j;
	}
	static {
		System.out.println("there....");
	}
	public void show() {
		System.out.println("This is static a :" + a);
		System.out.println("This is non-static b :" + b);
	}
	static {
		System.out.println("Now ...");
	}
	public static void main(String[] args) {
		StaticDemo x = new StaticDemo();
		StaticDemo y = new StaticDemo();
		x.set(1, 4);
		x.show();
		y.set(3, 6);
		y.show();
		x.show();

	}

}
