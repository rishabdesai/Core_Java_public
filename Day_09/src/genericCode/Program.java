//if we want to write generic type-safe code, then we should use generics in java
//It gives strong type checking at compile time
//it completely eliminates type-casting
//we can write generic data-structure and algorithms


package genericCode;

class Square<T> {  // T :  Type parameter
	private T sides;

	public T getSides() {
		return sides;
	}

	public void setSides(T sides) {
		this.sides = sides;
	}

}

public class Program {
	public static void main(String[] args) {

		// Integer
		Square<Integer> s1 = new Square<>();  	//<Integer> : Type argument (MUST be reference type)
		s1.setSides(5);  						//auto-boxing
		int n1 = s1.getSides();					//auto-unboxing
		System.out.println(n1);		

		// Float
		Square<Float> f1 = new Square<>();
		f1.setSides(1.5f);
		System.out.println(f1.getSides());

		// Double
		Square<Double> d1 = new Square<>();
		d1.setSides(1.5);
		System.out.println(d1.getSides());

	}

}
