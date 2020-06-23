package concept;

public class Nestedclass {
 private static String str = "Edureka";
 // static class
 static class MyNestedClass {
	 // non-static method
	 public void disp() {
		 System.out.println(str);
	 }
	 // static method
	 static void show() {
		 System.out.println("Static method of inner static   class..");
	 }
 }
	public static void main(String[] args) {
		Nestedclass.MyNestedClass obj = new Nestedclass.MyNestedClass();
		obj.disp();
		Nestedclass.MyNestedClass.show();
	}

}
