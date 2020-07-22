
public class AdditionUsingStrings {
public static void main(String[] args) {
	StringBuilder num1 = new StringBuilder("1234");
	StringBuilder num2 = new StringBuilder("56");
	StringBuilder result = new StringBuilder();
	num1.reverse();
	num2.reverse();
	System.out.println("num1 :" + num1 + " num2 :" + num2);
	if (num1.length() < num2.length()) {
		for (int i = num1.length();i < num2.length();i++) {
			num1.append(0);
		}
	}
	else {
		for (int i = num2.length();i < num1.length();i++) {
			num2.append(0);
		}
	}
	num1.reverse();
	num2.reverse();
	int carry = 0;
	 for (int i = Math.max(num1.length(),num2.length()) - 1;i >= 0;i--) {
		 int sum = 0;
		 sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i))) + carry;
		 if (sum > 9) {
			 carry = sum / 10;
			 sum %= 10;
		 }
		 else {
			 carry = 0;
		 }
		 result.append(sum);
	 }
	 System.out.println(result.reverse());
}
}
