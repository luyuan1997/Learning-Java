package p20190123;

public class AccountingSyncClass implements Runnable{
	//共享资源(临界资源)
	static int i = 0;
	
	//作用于静态方法,锁是当前class对象,也就是AccountingSyncClass类对应的class对象
	public static synchronized void increase() {
		i++;
	}
	
	//synchronized 修饰实例方法,非静态,访问时锁不一样不会发生互斥
	public synchronized void increase4Obj() {
		i++;
	}
	
	@Override
	public void run() {
		for(int j = 0; j < 1000000; j++) {
			increase();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		AccountingSyncClass instance1 = new AccountingSyncClass();
		AccountingSyncClass instance2 = new AccountingSyncClass();
		Thread t1 = new Thread(instance1);
		Thread t2 = new Thread(instance2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}
}
