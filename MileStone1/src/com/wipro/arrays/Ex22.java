package com.wipro.arrays;

public class Ex22 {

	public static void main(String[] args) {
		int[] a = new int [] {10,2,3,4,7};
		int n = a.length;
		int min = a[0]; 
		int max = a[0];
		for ( int i = 0; i < n; i++ ) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("The minimmum and the maximum values of an array are "+min+ " and "+ max+ " respectively.");
	}

}
