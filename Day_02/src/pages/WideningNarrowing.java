package pages;

public class WideningNarrowing {

	public static void main1( String [] args )
	{
		double num1 = 10.1;
		int num2 =( int ) num1;	//Narrowing : Ok
		System.out.println("Num2	:	"+num2);
	}
	public static void main2( String[] args )
	{
		int num1 = 10;	//Ok
		double num2 = num1;	//Widening : Ok
		System.out.println("Num2	:	"+num2);
	}
	
	//command line arguments
	//if parseXxx method fails, then it throws numberFormatException
	public static void main3( String[] args )
	{
		int num1 = Integer.parseInt( args[ 0 ] );
		float num2 = Float.parseFloat( args[ 1 ] );
		double num3 = Double.parseDouble( args[ 2 ] );
		double result = num1 + num2 + num3;
		System.out.println( "Result	:	"+result );
	}
}