
public class ThreadUsingThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println("Inside run");
	}

	public static void main(String[] args) {
		Thread th = new ThreadUsingThreadClass();
		th.start();
	}

}
