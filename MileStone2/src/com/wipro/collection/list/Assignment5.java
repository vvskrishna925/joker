package com.wipro.collection.list;

import java.util.*;

public class Assignment5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<String> list = new LinkedList<>();
	for (int i = 0;i < 12;i++) {
		list.add(sc.nextLine());
	}
	System.out.println(list);
	sc.close();
}
}
