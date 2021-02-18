
/* if we want to access static members of packaged class/type outside that
 * package without class name, then we should use static import statement.
 * 
 * Math is a final class declared in java.lang package
 * all the members of math class are static.
 */

package pages;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
	

public class StaticImport {

	public static void main(String[] args) {
		float radius =10.0f;
		float area = (float)(PI*pow(radius,2));
		System.out.println(area);
	}

}
