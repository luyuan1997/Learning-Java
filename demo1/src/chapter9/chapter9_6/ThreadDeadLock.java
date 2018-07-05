package chapter9.chapter9_6;

class Zhangsan{
	public void say() {
		System.out.println("张三对李四说：你给我画，我给你书");
	}
	public void get() {
		System.out.println("张三得到画了");
	}
}

class Lisi{
	public void say() {
		System.out.println("李四对张三说：你给我书，我给你画");
	}
	public void get() {
		System.out.println("李四得到书 了");
	}
}

public class ThreadDeadLock implements Runnable{
	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();
	private boolean flag = false;
	public void run() {
		if(flag) {
			synchronized(zs){
				zs.say();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (ls) {
					zs.get();
				}
			}
		}else {
			synchronized(ls) {
				ls.say();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (zs) {
					ls.get();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDeadLock t1= new ThreadDeadLock();
		ThreadDeadLock t2= new ThreadDeadLock();
		t1.flag = true;
		t2.flag = false;
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}

}
