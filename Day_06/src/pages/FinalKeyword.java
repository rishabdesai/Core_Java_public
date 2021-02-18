package pages;

class Test1
{
	private int number;
	public Test1( int number ) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		final Test1 t1 = new Test1( 10 ); //t1 reference is final and not the object
		t1.setNumber(100);
		System.out.println(t1.getNumber());
		
		//t1 = new Test1(20); //error as reference t1 is final, we cannot change it.
 		}

}
