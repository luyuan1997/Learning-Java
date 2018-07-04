package chapter9.chapter9_2;

class MyThread1 implements Runnable{
	private String name;
	public MyThread1(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name + "运行,i=" + i);
		}
	}
};

public class RunnableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 my1 = new MyThread1("线程A");
		MyThread1 my2 = new MyThread1("线程B");
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		t1.start();
		t2.start();
	}

}
