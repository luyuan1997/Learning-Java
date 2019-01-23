package p20190123;

public class AccountingSyncBad implements Runnable{
	//共享资源(临界资源)
	static int i = 0;
	
	//synchronized 修饰实例方法
	public synchronized void increase() {
		i++;
	}
	
	@Override
	public void run() {
		for(int j = 0; j < 1000000; j++) {
			increase();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		AccountingSyncBad instance1 = new AccountingSyncBad();
		AccountingSyncBad instance2 = new AccountingSyncBad();
		Thread t1 = new Thread(instance1);
		Thread t2 = new Thread(instance2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}
}
