package com.wipro.arrays;

public class Ex34 {
public static void main(String[] args) {
	int[][] a = new int [3][3];
	int k = 0;
		for (int i = 0;i < 3;i++) {
		for (int j = 0;j < 3;j++) {
			a[i][j] = Integer.parseInt(args[k++]);
			
		}
	}
	int max = a[0][0];
	for (int i = 0;i < 3;i++) {
		for (int j = 0;j < 3;j++) {
			if (max < a[i][j]) {
				max = a[i][j];
			}
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The biggest number in the given array is "+max);
}
}
