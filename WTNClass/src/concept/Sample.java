package concept;

public class Sample {
	final int a = 90;
	Sample(){
		this("Java");
		System.out.println("default constructor");
	}
	Sample (String str){
		System.out.println("argument constructor " + str);
	}
	public static void main(String[] args) {
		Sample s = new Sample();
	//	s.a = 89;   
	// final field sample cannot be assigned
		System.out.println(s.a);
	}

}
