package com.wipro.abstractclasses;

import java.util.*;

abstract class Compartment {
	public abstract String notice();
}
class Firstclass extends Compartment {
	public String notice() {
		return "Firstclass";
	}

}
class Ladies extends Compartment {
	public String notice() {
		return "Ladies";
	}
}
class General extends Compartment {
	public String notice() {
		return "General";
	}
}
class Luggage extends Compartment {
	public String notice() {
		return "Luggage";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];
		Random r = new Random();
		for (int i = 0;i < 10;i++) {
			int n = r.nextInt(4) + 1;
			if (n == 1) {
				c[i] = new Firstclass();
			}
			if (n == 2) {
				c[i] = new Ladies();
			}
			if (n == 3) {
				c[i] = new General();
			}
			if (n == 4) {
				c[i] = new Luggage();
			}
			System.out.println("Compartment "+(i+1)+" can be "+c[i].notice());
		}
	}

}
