package ExceptionalHandling;

import java.util.Scanner;

public class TryCatchThrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			if (num2 == 0) {
				throw new ArithmeticException(" Error : Divide by zero exception, ***Please Check***");
			} else {
				int result = num1 / num2;
				System.out.println("Result	:	" + result);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		sc.close();
	}

}
