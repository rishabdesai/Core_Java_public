package pages;

	//creata a class to count number of instances
	class CountNumber{
		//create one static variable and initialize to zero.
		public static int num=0;
		//inside constructor increment num
		public CountNumber() {
			++CountNumber.num;
		}
		//create one static method and return the count of num
		public static int getCount() {
			return num;
		}
	}

public class InstanceCounter {

	public static void main(String[] args) {
		
		CountNumber c1 = new CountNumber();
		CountNumber c2 = new CountNumber();
		CountNumber c3 = new CountNumber();
		
		System.out.println("count is : "+CountNumber.getCount());
	}

}
