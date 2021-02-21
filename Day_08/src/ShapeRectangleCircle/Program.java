package ShapeRectangleCircle;

import java.util.Scanner;

abstract class Shape {
	protected double area;

	public abstract void calculateArea();

	public double getArea() {
		return area;
	}
}

class Rectangle extends Shape {
	private double length;
	private double breadth;

	public void setLength(double length) {
		this.length = length;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		this.area = Math.PI * Math.pow(this.radius, 2);
	}
}

class Program {
	private static Scanner sc = new Scanner(System.in);

	/*
	 * In case of upcasting, if we want to call sub-class specific method which are
	 * not exists in superclass, at that time we shold do downcasting. instanceof -
	 * is a operator which is used to check whether superclass reference is storing
	 * reference of which subclass reference.
	 */
	public static void acceptRecord(Shape shape) {
		if (shape instanceof Rectangle) {
			Rectangle rect = (Rectangle) shape; // downcasting
			System.out.print("Length	:	");
			rect.setLength(sc.nextDouble());
			System.out.print("Breadth	:	");
			rect.setBreadth(sc.nextDouble());
		} else {
			Circle c = (Circle) shape; // down casting
			System.out.print("Radius	:	");
			c.setRadius(sc.nextDouble());
		}
	}

	public static void printRecord(Shape shape) {
		System.out.println("Area	:	" + shape.getArea());
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public static void main(String[] args) throws Exception {
		int choice;
		while ((choice = Program.menuList()) != 0) {
			Shape shape = null;
			switch (choice) {
			case 1:
				shape = new Rectangle(); // Upcasting
				break;
			case 2:
				shape = new Circle(); // Upcasting
				break;
			}
			if (shape != null) {
				Program.acceptRecord(shape);
				shape.calculateArea();
				Program.printRecord(shape);
			}
		}
	}
}