package arrayBasics;

import java.util.Arrays;

public class MultiDimentionArray {

	public static void main(String[] args) {
		int[][]arr =
				{
					{10, 20, 30},
					{40, 50, 60},
					{70, 80, 90},
					{100,110,120}
				};
		
		//print using for loop
		for( int row = 0; row < arr.length; ++ row )
		{
			for( int col = 0; col < arr[ row ].length; ++ col )
			{
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		} 
		
		//using Arrarys.toString()
		for( int row = 0; row < arr.length; ++ row )
		{
			System.out.println(Arrays.toString( arr[ row ] ) );
		}
		
		//using foreach loop
		for(int[] i : arr )
		{
			for( int j : i )
				System.out.print(j+"	");
			System.out.println();
		}
		
	}

	}


