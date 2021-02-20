package AbstractMethodAndClass;

abstract class Shape  //we cannot create object of abstract class, but we can create reference of abstract class
{
	protected double area;  
	public  void calculateArea( )  //by default public and abstract.
	{	}
	public double getArea() {
		return area;
	}
}

class Circle extends Shape  //if you extend any abstract class, then subclass should override abstract methods.
{
	private double radius = 10; 
	public void calculateArea( )
	{
		this.area = Math.PI * Math.pow(radius, 2);
	}
}
class Program
{
	public static void main(String[] args) throws Exception {
		Shape sh = new Circle();
		sh.calculateArea();
		System.out.println("Area	:	"+sh.getArea());
	}
}