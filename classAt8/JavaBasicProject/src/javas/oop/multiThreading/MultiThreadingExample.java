package javas.oop.multiThreading;

public class MultiThreadingExample {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyRunnable runnable = new MyRunnable(3);
		Thread runnableThread = new Thread(runnable);
		thread1.start();
		thread2.start();
		//runnable.run();
		runnableThread.start();
	}
}
