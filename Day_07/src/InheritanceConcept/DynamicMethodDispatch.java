/*Dynamic method dispatch : In upcasting, process of calling method of subclass
 *using reference of superclass is called as dynamic method dispatch
 * (in c++ runtime polymorphism)
 *In case of upcasting, using superclass reference, we can access inherited MEMBER and
 *overridden METHOD of subclass ONLY.
 */

package InheritanceConcept;

class Parent{
	public void print() {
		System.out.println("inside parent class");
	}
}
class Child extends Parent{
	public void print() {
		System.out.println("inside child class");
	}
}
public class DynamicMethodDispatch {
	//reference of A class and object of B class	
		public static void main(String[] args) {
			Parent p = new Child();  //upcasting
			
			//At compile time c gets bind with A class, at runtime c gets bind with B class
			p.print(); //output = inside B class  // Dynamic method dispatch
		}
	}


	