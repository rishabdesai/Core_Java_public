package arrayBasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayExceptions {

	// IndexOutOfBoundsException for collections
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		int element = list.get( list.size( ) );//IndexOutOfBoundsException
	}
	
	//StringIndexOutOfBoundsException for String
	public static void main(String[] args) {
		String str = "HelloWorld";
		char ch = str.charAt(str.length());//StringIndexOutOfBoundsException
	}
	
	//ArrayIndexOutOfBoundsException for Single array, multi-array and ragged array
	public static void main3(String[] args) {
		int[] arr = new int[] { 10,20,30};
		int element = arr[ arr.length ];//ArrayIndexOutOfBoundsException
	}
}
