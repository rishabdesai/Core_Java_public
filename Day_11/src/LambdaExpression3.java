/*Lambda Expression 
 * parameterize Method descriptor with return value
 */


interface Maths{
	int sum(int num1, int num2);
}
public class LambdaExpression3 {
	public static void main(String[] args) {

		Maths m = (num1, num2) -> num1+num2;
		int result = m.sum(2, 3);
		System.out.println("sum is : "+result);
	}

}
