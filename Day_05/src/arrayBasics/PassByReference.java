/*in C++ we can pass argument to method using = by value, by address, by ref
 * in C language we can pass argument to method using = by value, by address
 * in Java we can pass argument of any type(value or ref) using = ONLY by value
 * (Q) In java, how to pass variable to function using reference?
 */

package arrayBasics;

import java.util.Arrays;

public class PassByReference {

	public static void swap1(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}

	public static void swap2(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int[] arr1 = { num1, num2 };

		// pass by value - value do not swap
		System.out.println(Arrays.toString(arr1));
		PassByReference.swap1(num1, num2);
		System.out.println(Arrays.toString(arr1));
		System.out.println();

		// pass by reference - value swaps
		System.out.println(Arrays.toString(arr1));
		PassByReference.swap2(arr1);
		num1 = arr1[0];
		num2 = arr1[1];
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);

		System.out.println(Arrays.toString(arr1));
	}

}

//by creating single element array
/*
	public static void main(String[] args) {
	int[] num = { 1 };
	System.out.println("number= " + num[0]);
	update(num);
	System.out.println("number= " + num[0]);
}
private static void update(int[] num) {
	num[0]++;
}
}
*/
