package pages;

public class ReverseTheInteger {

	public static void main(String[] args) {
		int num = 1234, reverse=0;
		System.out.println(num);
		
		while(num !=0) {
			int digit = num % 10;
			System.out.println("digit = num % 10 " +digit);
			reverse = reverse *10 + digit;
			System.out.println("reverse = reverse *10 + num; " +reverse);
			num = num /10;
			System.out.println("num = num % 10 " +num);
		
		}
		System.out.println(reverse);
		
	}

}
