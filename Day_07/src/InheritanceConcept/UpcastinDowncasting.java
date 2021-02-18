package InheritanceConcept;

class Persons {
	private String name;
	private int age;

	public Persons() {
		this("", 0);
	}

	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showRecord() // method of super class
	{
		System.out.println("Name	:	" + this.name);
		System.out.println("Age	:	" + this.age);
	}

	public void printRecord() {
		System.out.println("Name	:	" + this.name);
		System.out.println("Age	:	" + this.age);
	}
}

class Employees extends Persons // Inheritance
{
	private int empid;
	private float salary;

	public Employees() {
		this.empid = 0;
		this.salary = 0;
	}

	public Employees(String name, int age, int empid, float salary) {
		super(name, age); // call to superclass constructor
		this.empid = empid;
		this.salary = salary;
	}

	public void displayRecord() // method of sub-class
	{
		super.showRecord();// Ok // call to superclass method
		System.out.println("Empid	:	" + this.empid);
		System.out.println("Salary	:	" + this.salary);
	}

	public void printRecord() {
		super.printRecord(); // call to superclass method
		System.out.println("Empid	:	" + this.empid);
		System.out.println("Salary	:	" + this.salary);
	}
}

public class UpcastinDowncasting {

	public static void main1(String[] args) {
		Employees emp = new Employees("XYZ", 33, 1234, 99000);
		Persons p = emp; // Upcasting : Ok
		p.showRecord(); // method of superclass
	}

	public static void main2(String[] args) {
		Persons p = new Employees("XYZ", 33, 1234, 99000); // upcasting
		Employees emp = (Employees) p; // Downcasting
		emp.displayRecord(); // method of subclass
	}

	public static void main3(String[] args) {
		Persons p = new Persons("XYZ", 33);
		Employees emp = (Employees) p; // ClassCastException
	}

	public static void main(String[] args) {
		Persons p = new Employees("XYZ", 33, 1234, 9900); // upcasting
		p.printRecord(); // method of subclass = Dynamic Method Dispatch
	}

}
