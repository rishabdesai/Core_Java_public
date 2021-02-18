package arrayBasics;

import java.util.Arrays;
class EmpDetails{
	private int id, sal;
	public EmpDetails() {
		this.id=10;
		this.sal=20;
	}
	@Override
	public String toString() {
		return "id : "+id+"  "+"sal : "+sal;
	}
}

public class ArrayTypes {
	

	public static void main(String[] args) {
		
		//Array of Value type
		//If we create array of value type, then default value of the array is 
		//depends on default value of datatype.
		boolean[] arr1 = new boolean[3];
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		//Array of reference type
		//for reference type, default value is null.
		EmpDetails[] emp = new EmpDetails[3];
		for(EmpDetails e : emp) {
			System.out.println(e);
		}
		System.out.println();
		
		//Array of object of reference type
		EmpDetails[] emp1 = new EmpDetails[3];
		
		for(EmpDetails e : emp1) {
			System.out.println(e);
		}
		
		for(int i=0;i<emp1.length;++i) {
			emp1[i]= new EmpDetails();
		}
		
		for(EmpDetails e : emp1) {
			System.out.println(e);
		}
		
		
		
		
	}

}
