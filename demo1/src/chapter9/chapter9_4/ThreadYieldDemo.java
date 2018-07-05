package chapter9.chapter9_4;

class MyThread8 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + "运行-->"+i);
			if(i == 3) {
				System.out.println("线程礼让");
				Thread.currentThread().yield();
			}
		}
	}
}

public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8 my = new MyThread8();
		Thread t1 = new Thread(my,"线程A");
		Thread t2 = new Thread(my,"线程B");
		t1.start();
		t2.start();
	}

}
