/*Singleton class- class from which we can create only one instance.
 * If constructor is private, then we can create instance of class inside method of same class.
 */
package pages;

class Singleton{
	
	//private constructor
	private Singleton() {
		System.out.println("inside constructor of Singleton class");
	}
	private static Singleton instance =null;
	
	public static Singleton getInstance() {
		if(instance ==null)
			instance = new Singleton();

		return instance;
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}

}
