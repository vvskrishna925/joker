import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String str = args[0];
		StringBuilder st = new StringBuilder(str);
		st.reverse();
		if(str.contentEquals(st)) {
			System.out.println( str + " is palindrome ");
		}
		else {
			System.out.println( str + " is not palindrome ");
		}
	}
}
