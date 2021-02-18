/* instance method : non-static method declared inside the class.
 * class level method: static method declared inside the class.
 * 
 * we can call static method on class name as well object reference. BUT it is 
 * designed to call on CLASS Name ONLY.
 */

package pages;

public class StaticMethod {

	//If method is not accessing any static or non-static member of class, then 
	//declare such method as static. (Also called as Utility method)
	public static int square(int num) {
		return num*num;
	}
	
	public static void main(String[] args) {
		
		System.out.println(square(2));

	}

}
