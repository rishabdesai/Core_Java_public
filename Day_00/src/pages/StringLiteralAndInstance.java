package pages;

public class StringLiteralAndInstance {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2= "abcd";
		String s3 = new String("abcd");
		
		//System.out.println(s1==s1);
		//System.out.println(s1==s3);
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
	}

}
