package methodReference;

interface Program1{
	void print();  //method descriptor
}

interface Program2{
	void print(String message); //method descriptor
}
public class MethodRef {
	
	public static void showRecord() {  //static method
		System.out.println("hello from showRecord");
	}
	
	public void displayRecord(String message) {  //non-static method
		System.out.println("hello : "+ message);
	}

	public static void main(String[] args) {

		//using lambda expression
		//Program1 p1 = () -> System.out.println("hello from Program1");
		//p1.print();
	
		
		Program1 p1 = MethodRef::showRecord;
		p1.print();
		
		
		MethodRef m2 = new MethodRef();
		Program2 p2 = m2::displayRecord;
		p2.print("from displayRecord" );
		
	}

}
