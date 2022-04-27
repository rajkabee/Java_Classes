package multithreading.threads;

public class MyThread extends Thread{
	int threadId;
	
	public MyThread(int threadId) {
		this.threadId = threadId;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(threadId+". MyThread running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
