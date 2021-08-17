public class Ex21 {

	public static void main(String[] args) {
		int[] a = new int [] {1,2,3,4,7};
		int n = a.length;
		float sum = 0 , avg = 0;
		for (int i = 0; i < n ; i++) {
			sum += a[i];
		}
		avg = (sum) / n;
		System.out.println("The Sum and Average of the array is "+sum+" and "+avg+" respectively.");
	}

}
