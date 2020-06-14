package com.wipro.arrays;

public class Ex26 {

	public static void main(String[] args) {
		int[] a = new int [] {1,54,34,78,45,98,23};
		int n = a.length;
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i+1 ;j < n ; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
