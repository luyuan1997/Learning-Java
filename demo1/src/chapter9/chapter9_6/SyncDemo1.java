package chapter9.chapter9_6;

class MyThread1 implements Runnable{
	private int ticket = 5;
	public void run() {
		for(int i=0; i<100; i++) {
			this.sale();
		}
	}
	public synchronized void sale() {
		if(ticket > 0) {
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ÂôÆ±£ºticket="+ticket--);
		}
	}
}

public class SyncDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mt = new MyThread1();
		Thread m1 = new Thread(mt);
		Thread m2 = new Thread(mt);
		Thread m3 = new Thread(mt);
		m1.start();
		m2.start();
		m3.start();
	}

}
