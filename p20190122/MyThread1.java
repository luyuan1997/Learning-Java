package p20190122;

public class MyThread1 extends Thread {
	private volatile boolean flag = true;
	public void stopTask() {
		flag = false;
	}
	public MyThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		synchronized(this) {
			try {
				int i = 0;
				while(flag) {
					Thread.sleep(1000);
					i++;
					System.out.println(Thread.currentThread().getName() + " ("+this.getState()+") loop " + i);
				}
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() +" ("+this.getState()+") catch InterruptedException.");
			}
		}
	}
}
