package InheritanceConcept;

class Person1 {
	private String name;
	private int age;

	public Person1() {
		this("", 0);
	}

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printPerson() {
		System.out.println("inside printPerson() method of Person1 class");
		System.out.println("Name	:	" + this.name);
		System.out.println("Age	:	" + this.age);
	}

	public void print() {
		System.out.println("inside print() method of Person1 class");
		System.out.println("Name	:	" + this.name);
		System.out.println("Age	:	" + this.age);
	}
}

class Employee1 extends Person1 // Inheritance
{
	private int empid;

	public Employee1() {
		this.empid = 0;
	}

	public Employee1(String name, int age, int empid) {
		super(name, age); // call to superclass constructor
		this.empid = empid;
	}

	public void printEmployee() // method of sub-class
	{
		System.out.println("inside printEmployee() method of Employee1 class");
		super.printPerson(); // call to superclass method
		System.out.println("Empid	:	" + this.empid);
	}

	public void print() {
		System.out.println("inside print() method of Employee1 class");
		super.printPerson(); // call to superclass method
		System.out.println("Empid	:	" + this.empid);
	}
}

public class InheritanceBasics {

//reference and object is of super class (Person1)	
	public static void main1(String[] args) {
		Person1 p = new Person1("ABC", 11); //
		p.printPerson(); // calling method of superclass
	}

//reference and object is of subclass (Employee1)	
	public static void main2(String[] args) {
		Employee1 emp = new Employee1("XYZ", 45, 9876);
		emp.printEmployee(); // calling method of subclass
		System.out.println("------------------");
		emp.printPerson(); // on subclass reference, we can call method of superclass
	}

//in case of upcasting, using superclass reference, we can 
//access inherited members & OVERRIDEN METHODS of subclass only.
	public static void main3(String[] args) {
		Person1 p = new Employee1();
		p.printPerson(); //ok super-class reference can call superclass method
		p.print(); // print() is overridden in subclass
		//p.printEmployee(); //error. Using superclass ref, we cannot call subclass methods
	}
}