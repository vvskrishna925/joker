package com.wipro.arrays;

public class Ex32 {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3};
		int[] b = new int[] {4,5,6};
		int[] c = new int[2];
		c[0] = a[1];
		c[1] = b[1];
		for (int i = 0;i < c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
