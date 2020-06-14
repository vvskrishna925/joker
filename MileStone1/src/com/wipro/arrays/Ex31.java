package com.wipro.arrays;

public class Ex31 {

	public static void main(String[] args) {
		int[] a = new int [] {1,4,1,4};
		int n = a.length;
		boolean state = true ;
		for (int i = 0; i < n; i++) {
			if (a[i] != 1 && a[i] != 4) {
				state = false;
			}
		}
		System.out.println(state);
	}

}
