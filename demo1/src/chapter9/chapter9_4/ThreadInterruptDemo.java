package chapter9.chapter9_4;

class MyThread5 implements Runnable{
	public void run() {
		System.out.println("1.进入RUN方法");
		try {
			Thread.sleep(10000);
			System.out.println("2.已经完成休眠");
		}
		catch(Exception e){
			System.out.println("3.休眠被终止");
			return;
		}
		System.out.println("4.run方法正常结束");
	}
}

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 mt = new MyThread5();
		Thread t = new Thread(mt,"线程");
		t.start();
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
		t.interrupt();
	}

}
