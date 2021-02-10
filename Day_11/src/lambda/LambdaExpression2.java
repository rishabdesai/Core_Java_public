package lambda;
/*Lambda Expression 
 * parameterize Method descriptor
 */


interface Math{
	void sum(int num1, int num2);
}
public class LambdaExpression2 {
	public static void main(String[] args) {

		Math m = (num1, num2) -> System.out.println("sum is : "+(num1+num2));
		m.sum(2, 3);
		
	}

}
