package Boxing;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		//Boxing
		int num=10;
		String strnum1 = String.valueOf(num);
		System.out.println("strnum1   :   "+strnum1);
	
		String strnum2 = Integer.toString(num);
		System.out.println("strnum2   :   "+strnum2);
		
		//auto-boxing
		Object obj = num;
		System.out.println(obj);
		
		//unboxing
		String str = "99";
		int n1 = Integer.parseInt(str); 
		
		//auto unboxing
		Integer val = new Integer(88);
		int n2 =val;
		System.out.println(n2);
		int n3 = val.intValue();
		System.out.println(n3);
	}

}
