package com.wipro.collection.list;
import java.util.*;
public class Assignment1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> al = new ArrayList<>();
	for (int i = 0;i < 12;i++) {
		al.add(sc.nextLine());
	}
	System.out.println(al);
	sc.close();
}
}
