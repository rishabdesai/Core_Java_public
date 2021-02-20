package ExceptionalHandling;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//try block
		try {
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println("Result	:	" + result);
			sc.close();
		} 
		//catch block
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
