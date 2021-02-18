package pages;

enum Color{
	RED,GREEN,BLUE
}

public class Enum1 {
	public static void main(String[] args) {
		Color c1 = Color.RED;
		
		String name = c1.name(); // name()
		int ordinal = c1.ordinal(); //ordinal
		
		System.out.println(name+"    "+ordinal);	
		
		
		String name1 = "GREEN";
		Color c2=Color.valueOf(name1);  //valueOf() to convert string to Enum
		System.out.println(c2);
		
		
		Color[] c3 = Color.values();  //values() method returns array of enum members
		for(Color c4 : c3) {
			String name2 = c4.name();
			int ordinal2 = c4.ordinal();
			System.out.println(name2+"    "+ordinal2);	
		}
	}
}


/*if you want to assign name to any literals then we should use enum
 * Main purpose of enum to improve readability of source code
 * enum is a reference type and is a keyword in java
 * enum is implicitly extended from java.lang.Enum class.
 * java.lang.Enum class implements Serializable, Comparable
 * methods of Enum - getDeclaringClass(), name(), ordinal(), valueOf().
 */

