package core.intro.oop.multiThreading;

public class MyRunnable implements Runnable {
	int threadId;

	public MyRunnable(int threadId) {
		this.threadId = threadId;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread " + threadId + " running!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
