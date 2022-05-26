package javas.oop.multiThreading;

public class MultiThreadingExample {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		MyThread thread1 = new MyThread(1, num);
		MyThread thread2 = new MyThread(2, num);
		MyRunnable runnable = new MyRunnable(3, num);
		Thread runnableThread = new Thread(runnable);
		thread1.start();
		thread2.start();
		//runnable.run();
		runnableThread.start();
	}
}
