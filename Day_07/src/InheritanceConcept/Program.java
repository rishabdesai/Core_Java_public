package InheritanceConcept;

class Person
{
	private String name;
	private int age;
	public Person() {
		this("",0);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord()  //method of super class
	{
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
	public void printRecord()
	{
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}

//All the fields(static and non-static) of any modifier including private of the 
//   superclass inherit into subclass.
//Except constructor, all the static and non-static methods of superclass inherit
//   into the subclass.
class Employee extends Persons  //Inheritance
{
	private int empid;
	private float salary;
	
	public Employee() {
		this.empid = 0;
		this.salary = 0;
	}
	
	public Employee(String name, int age, int empid, float salary) {
		super( name, age );  // call to superclass constructor
		this.empid = empid;
		this.salary = salary;
	}

	public void displayRecord()  //method of sub-class
	{
		//this.showRecord();	//Ok
		super.showRecord();//Ok  // call to superclass method
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
	public void printRecord()
	{
		super.printRecord();  // call to superclass method
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {

	public static void main1(String[] args) {
		//Person  p = new Person();
		Persons  p = new Persons("ABC",23);  //
		p.showRecord();
	}
	public static void main2(String[] args) {
		//Employee emp = new Employee();
		Employee emp = new Employee("ABC",23,2113,35000);
		emp.displayRecord();
	}
	public static void main3(String[] args) {
		Employee emp = new Employee("ABC",23,2113,35000);
		emp.showRecord();
		emp.displayRecord();
	}
	public static void main4(String[] args) {
		Employee emp = new Employee("ABC",23,2113,35000);
		emp.displayRecord();
	}
	public static void main5(String[] args) {
		Employee emp = new Employee("ABC",23,2113,35000);
		emp.displayRecord();
		System.out.println();
		
		//Person p = ( Person)emp;	//Upcasting : Ok
		Persons p = emp;	//Upcasting : Ok
		p.showRecord();
	}
	public static void main6(String[] args) {
		Persons p = new Employee("ABC",23,2113,35000);
		p.showRecord();
		
		System.out.println();
		Employee emp = (Employee) p;	//Downcasting
		emp.displayRecord();
	}
	public static void main7(String[] args) {
		Persons p = new Persons("ABC",23);
		Employee emp = (Employee) p; //ClassCastException
	}
	public static void main8(String[] args) {
		Persons p = new Employee();
		p.printRecord();
	}
}