package javas.oop.multiThreading;

public class MyThread extends Thread{
	int threadId;
	public MyThread(int threadId) {
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread "+threadId+" called");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
