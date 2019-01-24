package p20190123;

public class AccountingSync2 implements Runnable{
	static AccountingSync2 instance = new AccountingSync2();
	
	//共享资源(临界资源)
	static int i = 0;
	static int j = 0;
	
	//synchronized 修饰实例方法
	public synchronized void increase() {
		j++;
	}
	
	@Override
	public void run() {
		for(int j = 0; j < 1000000; j++) {
			//this,当前实例对象锁
			synchronized(this){
				i++;
				increase();//synchronized的可重入性
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}
}
