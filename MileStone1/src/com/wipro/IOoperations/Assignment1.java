package com.wipro.IOoperations;
import java.io.*;
import java.util.*;
public class Assignment1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		System.out.println("Enter the character to be counted");
		char ch = sc.nextLine().charAt(0);
		int charCount = 0;
		BufferedReader br = new BufferedReader(new FileReader(file));
		int c;
		do {
			c = br.read();
			if (ch >= 65 && ch <= 90) {
				ch += 32;
			}
			if (c >= 65 && c <=90) {
				c += 32;
			}
			if (ch == c) {
				charCount++;
			}
		}while (c != -1);
		System.out.println("File '"+ fileName + "' has " + charCount + " instances of letter '" + ch + "'." );
	}
}
