package ExceptionalHandling;

import java.util.Scanner;

public class TryThrowWithResource {

	public static void main(String[] args) {
		//try with resource
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			if (num2 == 0)
				//throw statement
				throw new ArithmeticException(" Error : Divide by zero exception, ***Please Check***");
			else {
				int result = num1 / num2;
				System.out.println("Result	:	" + result);
			}
		}
	}

}
