package chapter9.chapter9_4;

class MyThread2 implements Runnable{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName()+"运行,i="+i);
		}
	}
}

public class ThreadAliveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt,"线程");
		System.out.println("线程开始执行之前 -->"+t.isAlive());
		t.start();
		System.out.println("线程开始执行之后 -->"+t.isAlive());
		for(int i=0; i<3; i++) {
			System.out.println("main运行 -->"+i);
		}
		System.out.println("代码执行之后 -->"+t.isAlive());
	}

}
