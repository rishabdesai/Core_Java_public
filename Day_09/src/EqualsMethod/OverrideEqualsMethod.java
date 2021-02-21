package EqualsMethod;

class Employee1 {
	private String name;
	private int empid;

	public Employee1(String name, int empid) {
		this.name = name;
		this.empid = empid;
	}

	//Employee1 this = empid;
	//Object obj = emp2  //upcasting
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;  //downcasting
		if (empid != other.empid)
			return false;
		return true;
	}

}

public class OverrideEqualsMethod {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("name1", 1);
		Employee1 emp2 = new Employee1("name1", 1);
		if (emp1.equals(emp2))
			System.out.println("equals");
		else
			System.out.println("not equals"); // output is "not equals"

	}

}
