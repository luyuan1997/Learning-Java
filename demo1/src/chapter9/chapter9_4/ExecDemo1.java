package chapter9.chapter9_4;

class MyThread9 extends Thread{
	private int time;
	public MyThread9(String name, int time) {
		super(name);
		this.time = time;
	}
	public void run() {
		try {
			Thread.sleep(this.time);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "线程，休眠" + this.time + "毫秒.");
	}
}

public class ExecDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread9 mt1 = new MyThread9("线程A",10000);
		MyThread9 mt2 = new MyThread9("线程B",20000);
		MyThread9 mt3 = new MyThread9("线程C",30000);
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
