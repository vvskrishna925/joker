package com.wipro.collection.list;
import java.util.*;
@SuppressWarnings("serial")
class MyArrayList<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Double || e instanceof Float) {
			super.add(e);
			return true;
		}
		throw new ClassCastException ("Only Integer, Float, Double are supported");
	}
}
public class Assignment4 {
public static void main(String[] args) {
	List<Object> list = new MyArrayList<>();
	try {
		list.add(1234);
		list.add(12.4F);
		list.add(123.094D);
	//	list.add("Krishna");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(list);
}
}
