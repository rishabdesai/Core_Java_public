/* -It is a keyword in java
 * -If we want to delegate exception from one method to another method, 
 * then we should use throws
 * -If method throws multiple checked or unchecked exception,  
 * then after throws keyword - (a)specify name of all exceptions or (b)specify name of superclass
 * -we can delegate checked or unchecked exception from one method to another method.
 */

package ExceptionalHandling;

public class ThrowsKeyword {

	public static void print() throws InterruptedException {
		for (int i = 1; i <= 10; ++i) {
			System.out.println("Count	:	" + i);
			Thread.sleep(500);
		}
	}

	public static void main(String[] args) {
		try {
			ThrowsKeyword.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
