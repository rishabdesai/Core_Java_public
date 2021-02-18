package arrayBasics;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = new int[] {30,20,10,40,50};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
