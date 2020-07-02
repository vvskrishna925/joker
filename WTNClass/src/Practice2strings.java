
public class Practice2strings {

	public static void main(String[] args) {
		String s = new String("hi how are you");
		// System.out.println(s);
		// h i   h o w   a r e    y  o  u
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		// *** character from string
		System.out.println(s.substring(3, 14));
		// this is used in looping statements 
		// Note : check with index (OutOfBounds)
		System.out.println(s.concat(" Krishna"));
		System.out.println(s);
		String st = "Krishna";
		System.out.println("Welcome ".concat(st));
		// strings are immutable 	(can't change its operation)
		st = "Welcome ".concat(st);
		System.out.println(st);
	}

}
