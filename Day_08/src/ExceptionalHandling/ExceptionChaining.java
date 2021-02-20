/* If superclass method do not throw checked exception, then sub-class method
 * also cannot throw checked exception. 
 * In method overriding, unchecked exception is not considered
 * To solve this problem, sub-class method throws unchecked exception. 
 */

package ExceptionalHandling;

class A {
	public void print() {
	}
}

class B extends A {
	public void print() throws RuntimeException {
		try {
			for (int count = 1; count <= 10; ++count) {
				System.out.println("Count	:	" + count);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) { //process of handling exception using new type of exception is called
			throw new RuntimeException(e);// Exception Chaining
		}
	}
}

public class ExceptionChaining {
	public static void main(String[] args) throws Exception {
		A a = new B();
		a.print();
	}

}
