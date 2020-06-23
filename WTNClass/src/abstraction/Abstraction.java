package abstraction;


abstract class Shape {
	abstract void draw();
	abstract void erase();
	void display() {
		System.out.println(" Abstract class...");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle...");
	}
	void erase() {
		System.out.println("Erasing Circle...");
	}
}
class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing Triangle...");
	}
	void erase() {
		System.out.println("Erasing Triangle...");
	}
}
class Square extends Shape {
	void draw() {
		System.out.println("Drawing Square...");
	}
	void erase() {
		System.out.println("Erasing Square...");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// Shape sh = new Shape(); // compilation error 
		// we cannot create object for abstract classes
		Shape c = new Circle ();
		Shape t = new Triangle ();
		Shape s = new Square ();
		s.display();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		
	}

}
