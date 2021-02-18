package pages;

class Employee {
	private int empid;
	private int sal;

	public Employee() {
		this(200,300);  //constructor chaining (calling parameterized constructor from
						//parameterless constructor.
	}

	public Employee(int empid, int sal) {
		this.empid = empid;
		this.sal = sal;
	}

	public void printRecords() {
		System.out.println("empid  	:	" + empid);
		System.out.println("sal     :   " + sal);
	}
}

public class ConstructorChaining {
	public static void main1(String[] args) {
		Employee e1= new Employee();
		e1.printRecords(); // message passing, output empno=200, sal=300
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2=e1;  //shallow copy of reference
		e2.printRecords(); // output empno=200, sal=300
	}

}
