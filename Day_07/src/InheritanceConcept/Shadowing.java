package InheritanceConcept;

class A{
	int x=10;
	public void print() {
		System.out.println("inside A class");
	}
}
class B extends A{
	int x =20;
	public void print() {
		System.out.println("inside B class");
	}
}
public class Shadowing {
// reference of A class and object of A class
	public static void main1(String[] args) {
		A a = new A();
		System.out.println(a.x); //output =10
		
		a.print(); //output = inside A class
	}
	
//reference of B class and object of B class	
	public static void main2(String[] args) {
		B b = new B();
		System.out.println(b.x); //output =10, shadowing of superclass x value;
		
		b.print(); //output = inside B class, shadowing of superclass print() method.
	}
	
//reference of A class and object of B class	
	public static void main(String[] args) {
		A c = new B();
		System.out.println(c.x); //output =10, 
		
		c.print(); //output = inside B class
	}
}
