package com.wipro.arrays;

public class Ex33 {

	public static void main(String[] args) {
		int[][] a = new int [2][2];
		int m = a.length;
		int n = a[0].length;
		int k = 0;
		for (int i = 0;i < m;i++) {
			for (int j = 0;j < n;j++) {
				a[i][j] = Integer.parseInt(args[k++]);
			}
		}
		System.out.println("The given array is");
		for (int i = 0;i < m;i++) {
			for (int j = 0;j < n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse array is");
		for (int i = m - 1;i >= 0;i--) {
			for (int j = n - 1;j >= 0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
