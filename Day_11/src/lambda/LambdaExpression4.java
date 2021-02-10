package lambda;
/*Lambda Expression 
 * lambda body inside curly brackets
 */

interface Factorial{
	int fact(int num);  // function or method descriptor. 
}
public class LambdaExpression4 {
	public static void main(String[] args) {

		Factorial f = (number) -> {
			int result =1;
			for (int n =1; n<=number;++n)
				result = result*n;
			return result;
		};
		int res = f.fact(5);
		System.out.println("Factorial is : "+res);
	
	}

}
