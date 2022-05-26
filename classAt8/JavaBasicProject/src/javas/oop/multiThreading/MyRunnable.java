package javas.oop.multiThreading;

public class MyRunnable implements Runnable {
	int threadId;
	int[] num = new int[5];
	public MyRunnable(int threadId, int[] num) {
		this.num = num;
		this.threadId = threadId;
	}
	
	@Override
	public synchronized void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread "+threadId+" called");
//			for(int j=0; j<5; j++) {
//				num[j]+=100;
//				System.out.print(num[j]+"\t");
//			}
			num[0]+=100;
			
			System.out.println(num[0]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
