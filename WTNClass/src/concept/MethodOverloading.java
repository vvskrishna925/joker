package concept;
// char -> int -> long -> float -> double
// byte -> short -> int -> long -> float -> double
public class MethodOverloading {
	void sum(int a,double b) {
		System.out.println("Integer and Double:" + (a+b));
	}
	void sum (double a,double b) {
		System.out.println("double :" + (a+b));
	}
	void sum (int a,int b) {
		System.out.println("Integer :" + (a));
	}
	void sum (double a,int b) {
		System.out.println("Double and Interger :" + (a+b));
	}
	public static void main(String[] args) {
		MethodOverloading M = new MethodOverloading();
		M.sum(30, 30);
	}

}
