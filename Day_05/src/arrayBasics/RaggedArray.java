package arrayBasics;

public class RaggedArray {

	public static void main(String[] args) {
		int[][]arr = new int[ 3][ ];
		arr[ 0 ] = new int[  ] { 10, 20, 30 };
		arr[ 1 ] = new int[  ] { 40, 50 };
		arr[ 2 ] = new int[  ] { 60, 70, 80, 90 };
		
		for( int row = 0; row < arr.length; ++ row )
		{
			for( int col = 0; col < arr[ row ].length; ++ col )
				System.out.print(arr[ row ][ col ]+"	");
			System.out.println();
		}

	}

}
