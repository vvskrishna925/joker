package com.wipro.OverridingPolymorphism;
class Fruit {
	String name;
	String taste;
	String size;
	Fruit(String n,String t,String s){
		name = n;
		taste = t;
		size = s;
	}
	public void eat() {
		System.out.println(name+" is "+taste);
	}
}
class Apple extends Fruit {

	Apple(String n,String t,String s){
		super(n,t,s);
	}
	public void eat() {
		System.out.println(name+" is "+taste);
	}
}
class Orange extends Fruit {

	Orange(String n,String t,String s){
		super(n,t,s);
	}
	public void eat() {
		System.out.println(name+" is "+taste);
	}
}
public class Overriding {
public static void main(String[] args) {
	Apple a = new Apple("apple","sweet","medium");
	Orange o = new Orange("orange","sour","small");
	a.eat();
	o.eat();
}
}
