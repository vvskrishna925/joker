package com.wipro.classesandobjects;

public class Box {
	int height;
	int width;
	int depth;
	Box (int a,int b,int c){
		height = a;
		width = b;
		depth = c;
	}
	int volume() {
		int v = height * width * depth;
		return v;
	}
public static void main(String[] args) {
	Box B = new Box(8,9,7);
	System.out.println("The volume of the box is " + B.volume());
}
}
