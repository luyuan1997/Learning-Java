package chapter9.chapter9_4;

class MyThread1 implements Runnable{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName()+"运行,i="+i);
		}
	}
}

public class CurrentThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 my = new MyThread1();
		new Thread(my,"线程").start();
		my.run();
	}

}
