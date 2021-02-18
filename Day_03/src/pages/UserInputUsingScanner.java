/*scanner class is user to take input from user on console.
 * method of java.util.Scanner class: nextInt(), nextFloat(),nextFloat(),nextLine().
 * 
 */

package pages;

import java.util.Scanner;

public class UserInputUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Name	:	");
		String name = sc.nextLine();
		System.out.print("Empid	:	");
		int empid = sc.nextInt();
		System.out.print("Salary	:	");
		double salary = sc.nextDouble();

		System.out.printf("%-15s%-5d%-10.2f\n", name, empid, salary);
		sc.close();
	}

}
