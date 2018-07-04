package chapter9.chapter9_4;

class MyThread4 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			if(i>10) {
				try {
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}
}

public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 mt = new MyThread4();
		new Thread(mt,"线程").start();
	}

}
