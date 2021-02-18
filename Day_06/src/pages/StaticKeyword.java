/*instance variable : non-static variable declared inside the class
 * class level variable : static variable declared inside the class
 * 
 */

package pages;

public class StaticKeyword {
	int num1; //non-static fields
	int num2; //non-static fields
	static int num3; //static fields
	
	static {
		StaticKeyword.num3 = 30;
	}
	public StaticKeyword() {  }
	
	public StaticKeyword(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {
		StaticKeyword s1= new StaticKeyword(11,22);
		System.out.println(s1.num1);
		System.out.println(s1.num2);
		System.out.println(StaticKeyword.num3);
		
		/* error as main() method is static hence cannot access num1
		 to access num1 directly, then declare num1 as static or use object reference of class StaticKeyword.
		*/
		//System.out.println(num1); 
		
	}
}

/* Non-static fields:
 * If we declare non-static fields, then it gets space per instance. 
 * Designed to call using object reference
 * Gets space after creating instance of the class
 * To initialize, use should use constructor. Constructor gets called once per instance.
 * To access state of non-static field, the method should be non-static.
 * inside non-static method, we can access static as well non-static members.
 * 
 * static fields: 
 * If we declare static field, then it get space per class.
 * designed to call using class name
 * Gets space during class loading
 * To initialize static fields, we should use static initializer block
 * Static initializer block gets executed once per class.
 * To access state of static fields, method should be static. 
 * inside static method, we can access only static members of class.
 */