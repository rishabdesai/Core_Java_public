/* -if we want to define custom checked exception class, then extent it from java.lang.Exception class 
 * -if we want to define custom unchecked exception class, then extent it from java.lang.RuntimeException class
 * -if we want to handle exceptional situation in business logic, then we should write custom exception.
 */

package ExceptionalHandling;
import java.util.Scanner;

class StackOverflowException extends Exception
{
	public StackOverflowException() {
		this("Stack is full");
	}
	public StackOverflowException(String message) {
		super(message);
	}
}
class StackUnderflowException extends Exception
{

	public StackUnderflowException() {
		this("Stack is empty");
	}
	public StackUnderflowException(String message) {
		super(message);
	}
}
class Stack
{
	private int top = -1;
	private int size;
	private int[] arr;
	public Stack() {
		this( 3 ); 
	}
	public Stack( int size )
	{
		this.size = size;
		this.arr = new int[ this.size ];
	}
	public boolean empty()
	{
		return this.top == -1;
	}
	public boolean full()
	{
		return this.top == this.arr.length - 1;
	}
	public void push( int data ) throws StackOverflowException
	{
		if( this.full() )
			throw new StackOverflowException();
		this.arr[ ++ this.top ] = data;
	}
	public int peek() throws StackUnderflowException
	{
		if( this.empty())
			throw new StackUnderflowException();
		return this.arr[ this.top ];
	}
	public void pop( ) throws StackUnderflowException
	{
		if( this.empty())
			throw new StackUnderflowException();
		-- this.top;
	}
}

public class CustomExceptions {
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args)  
	{	
		int choice,data;
		Stack stack = new Stack();
		while( ( choice = CustomExceptions.menuList( ) ) != 0 )
		{
			try {
				switch( choice )
				{
				case 1:
					System.out.print("Enter data	:	");
					data = sc.nextInt();
					stack.push(data);
					break;
				case 2:
					data = stack.peek();
					System.out.println("Popped element is	:	"+data);
					stack.pop();
					break;
				}
			} 
			catch (StackOverflowException | StackUnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
