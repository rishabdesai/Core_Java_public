/*finally is a keyword in java
 * If you want to release local resource, then we should use finally block.
 * finally block must appear after all catch block
 * for single try block, we can write only one finally block
 * JVM always executes finally block
 */
package ExceptionalHandling;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		// try block
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println("Result	:	" + result);

		}
		// catch block
		catch (Exception ex) {
			ex.printStackTrace();
		}

		//finally block
		finally {
			sc.close();
		}
	}

}
