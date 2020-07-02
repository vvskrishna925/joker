
public class Praticestrings {
	// 8 character methods
	// 1 : isLetter()
	// 2 : isDigit()
	// 3 : isUppercase()
	// 4 : isLowercase()
	// 5 : isWhitespace()
	// 6 : toUppercase()
	// 7 : toLowercase()
	// 8 : toString()

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Character c = new Character ('a');
		char ch = c; // boxing : auto boxing, unboxing
		//boxing : converting an object/primitive data type into PDT/object
		// Auto boxing : converting PDT into object
		char a = 'l';
		Character b = new Character(a);
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.toString('v'));
		System.out.println(Integer.toString(23));
		System.out.println(b);
		System.out.println(ch);
	}

}
