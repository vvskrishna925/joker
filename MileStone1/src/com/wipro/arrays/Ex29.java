package com.wipro.arrays;

public class Ex29 {

	public static void main(String[] args) {
		int[] a = new int [] {11,9,10,79,12,10,10,45};
		int n  = a.length;
		int []b = new int [n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 10) {
				b[j++] = a[i]; 
			}
		}
		for (int i = j; i < n; i++) {
			b[j] = 0;
		}
		for (int i = 0; i < n; i++ ) {
			System.out.print(b[i]+" ");	
		}
		
	}

}
