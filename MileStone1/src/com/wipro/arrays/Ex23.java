package com.wipro.arrays;

public class Ex23 {
public static void main(String[] args) {
	int[] a = new int [] {1,4,34,56,7};
	int n = a.length;
	int k = Integer.parseInt(args[0]);
	int pos = -1;
	for ( int i = 0; i < n; i++ ) {
	if (a[i] == k) {
		pos = i;
	}
	}
	System.out.println(pos);
}
}
