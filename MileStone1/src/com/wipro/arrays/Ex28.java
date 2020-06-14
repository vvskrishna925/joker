package com.wipro.arrays;

public class Ex28 {

	public static void main(String[] args) {
		int[] a = new int [] {7,1,2,3,6};
		int n = a.length, sum = 0;
		boolean add = true;
		for (int i = 0; i < n ; i++) {
			if (a[i] != 6 && add) {
				sum += a[i];
			}
			 if (a[i] == 6) {
				add = false;
			}
			 if (a[i] == 7) {
				 add = true;
			 }
	}

		System.out.println(sum);
}
}
