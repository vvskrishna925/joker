package com.wipro.IOoperations;
import java.io.*;
import java.util.*;
public class Assignment2 {
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input file name");
	String inputFileName = sc.nextLine();
	System.out.println("Enter the output file name");
	String outputFileName = sc.nextLine();
	File inputFile = new File(inputFileName);
	File outputFile = new File(outputFileName);
	FileReader in = new FileReader(inputFile);
	FileWriter out = new FileWriter(outputFile);
	int c;
	while ((c = in.read()) != -1) {
		out.write(c);
	}
	in.close();
	out.close();
	System.out.println("File is copied");
}
}
