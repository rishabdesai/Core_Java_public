package arrayBasics;

public class VariableArgumentMethod {

	public static void sum(int... arr) {
		int result = 0;
		for (int a : arr) {
			result = result + a;
			System.out.print(result + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		VariableArgumentMethod.sum(10);
		VariableArgumentMethod.sum(10, 20);
		VariableArgumentMethod.sum(10, 20, 30);
	}
}
