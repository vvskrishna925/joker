package test1package;

import testpackage.Foundation;

public class TestDemo {

	public static void main(String[] args) {
		Foundation f  =  new Foundation();
		System.out.println ("other package");
		System.out.println("var4 = "+f.v4);
		// System.out.println("var2 = "+f.v2); only public can be access
	}

}
