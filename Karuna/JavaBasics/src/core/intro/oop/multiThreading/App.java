package core.intro.oop.multiThreading;

public class App {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1);
		MyThread thread2 = new MyThread(2);
		MyRunnable runnableThread = new MyRunnable(3);
		Thread thread3 = new Thread(runnableThread);
		thread1.start();
		thread2.start();
		// runnableThread.run();
		thread3.start();
	}
}
