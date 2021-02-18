package pages;

class Test
{
	private static int number = 10;
	public static void print() 
	{
		++number;
		System.out.println("number : "+number);
	}
}


public class IncrementNumber {
	
//	static int fun()
//	{
//		// error :In Java, a static variable is a class variable So 
		//if we have static local variable (scope limited to function), it violates the purpose of static.
//		static int n=100; 
//		return n--;
//	}
	public static void main(String[] args) {
		
		
		Test.print();
		Test.print();
		Test.print();
	}
}