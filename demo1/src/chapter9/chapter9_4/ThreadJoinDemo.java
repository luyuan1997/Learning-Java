package chapter9.chapter9_4;

class MyThread3 implements Runnable{
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt,"线程");
		t.start();
		for(int i=0; i<50; i++) {
			if(i>10) {
				try {
					t.join();
				}
				catch(Exception e){}
			}
			System.out.println("Main线程进行-->"+i);
		}
	}

}
