package com.wipro.arrays;

public class Ex30 {
	public static void main(String[] args) {
		int[] a = new int [] {1,0,1,0,0,1,1};
		int n  = a.length;
		int []b = new int [n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				b[j++] = a[i]; 
			}
		}
		for (int i = 0; i < n; i++) {
			 if (a[i] % 2 != 0) {
				 b[j++] = a[i];
			 }
		}
		for (int i = 0; i < n; i++ ) {
			System.out.print(b[i]+" ");	
		}
		
	}

}
