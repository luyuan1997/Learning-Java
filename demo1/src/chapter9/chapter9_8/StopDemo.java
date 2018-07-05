package chapter9.chapter9_8;

class MyThread implements Runnable{
	private boolean flag = true;
	public void run() {
		int i=0;
		while(this.flag) {
			System.out.println(Thread.currentThread().getName()+"运行,i="+(i++));
		}
	}
	public void stop() {
		this.flag = false;
	}
}

public class StopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my =new MyThread();
		Thread t=new Thread(my,"线程");
		t.start();
		my.stop();
	}

}
