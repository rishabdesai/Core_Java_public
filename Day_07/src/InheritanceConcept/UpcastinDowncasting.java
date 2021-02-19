package InheritanceConcept;

class Person2
{
	private String name;
	private int age;
	public Person2() {
		this("",0);
	}
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printPerson()  
	{
		System.out.println("inside printPerson() method of Person2 class");
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
	public void print()
	{
		System.out.println("inside print() method of Person2 class");
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}

class Employee2 extends Person2  //Inheritance
{
	private int empid;
	
	public Employee2() {
		this.empid = 0;
	}
	
	public Employee2(String name, int age, int empid) {
		super( name, age );  // call to superclass constructor
		this.empid = empid;
	}

	public void printEmployee()  //method of sub-class
	{
		System.out.println("inside printEmployee() method of Employee2 class");
		super.printPerson();  // call to superclass method
		System.out.println("Empid	:	"+this.empid);
	}
	public void print()
	{
		System.out.println("inside print() method of Employee2 class");
		super.printPerson();  // call to superclass method
		System.out.println("Empid	:	"+this.empid);
	}
}

public class UpcastinDowncasting {

	public static void main(String[] args) {
		Employee2 emp = new Employee2("XYZ", 33, 1234);
		Person2 p = emp; // Upcasting : Ok
		p.printPerson(); // method of superclass
	}

	public static void main2(String[] args) {
		Person2 p = new Employee2("XYZ", 33, 1234); // upcasting
		Employee2 emp = (Employee2) p; // Downcasting
		emp.printEmployee(); // method of subclass
	}

	public static void main3(String[] args) {
		Person2 p = new Person2("XYZ", 33);
		Employee2 emp = (Employee2) p; // ClassCastException
	}

//in case of upcasting, using superclass reference, we can 
//access inherited members & OVERRIDEN METHODS of sub class only.	
	public static void main4(String[] args) {
		Person2 p = new Employee2("XYZ", 33, 1234); // upcasting
		p.print(); // print() is overriden in subclass (Dynamic Method Dispatch)
	}

}
