package EqualsMethod;

class Employee {
	private String name;
	private int empid;

	public Employee(String name, int empid) {
		this.name = name;
		this.empid = empid;
	}
}

public class EqualsMethod {
	
	//As there is no "equals" method in Employee class, hence java.lang.Object class "equals"
	//method get called. Object class compare state of reference variable.
	public static void main3(String[] args) {
		Employee emp1 = new Employee("name1", 1);
		Employee emp2 = new Employee("name1", 1);
		if (emp1.equals(emp2))
			System.out.println("equals");
		else
			System.out.println("not equals"); //output is "not equals"

	}

	// equal equal (==) do not compare state of object, rather state of reference is
	// compared. 
	public static void main2(String[] args) {
		Employee emp1 = new Employee("name1", 1);
		Employee emp2 = new Employee("name1", 1);
		if (emp1 == emp2)
			System.out.println("equals");
		else
			System.out.println("not equals");  //output is "not equals"
	}

	// If we want to compare state/value of object/variable of primitive type then
	// we should use equal equal operator
	public static void main1(String[] args) {
		int n1 = 10;
		int n2 = 10;
		if (n1 == n2)
			System.out.println("equals");
		else
			System.out.println("not equals"); //output is "not equals"
	}
}
