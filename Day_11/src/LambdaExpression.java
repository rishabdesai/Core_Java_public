/*Lambda Expression 
 * Parameterless Method descriptor
 */


interface Printable{
	void print();
}
public class LambdaExpression {
	public static void main(String[] args) {
//		Printable p = new Printable() {
//			@Override
//			public void print() {
//				System.out.println("hello world");
//			}
//		};
//		p.print();

		// p1 is reference of interface
		// () is input parameter 
		// -> lambda expression. Everything after -> is Lambda body
		Printable p1 = () ->System.out.println("Hello !!!");
		p1.print();
		
	}

}
