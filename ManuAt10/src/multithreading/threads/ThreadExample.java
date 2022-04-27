package multithreading.threads;

public class ThreadExample {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread(1);
		MyThread myThread2 = new MyThread(2);
		Thread myThread3 = new Thread(new MyRunnable(3));
		//myThread1.run();
		//myThread2.run();
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
	}
}
