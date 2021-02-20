package ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		//try block
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println("Result	:	" + result);
			sc.close();
		} 
		//catch block
		catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
			//System.out.println(ex.getMessage());
		}

	}

}
