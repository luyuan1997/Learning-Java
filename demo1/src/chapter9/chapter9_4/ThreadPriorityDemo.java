package chapter9.chapter9_4;

class MyThread7 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"运行,i="+i);
		}
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread7(),"线程A");
		Thread t2 = new Thread(new MyThread7(),"线程B");
		Thread t3 = new Thread(new MyThread7(),"线程C");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
