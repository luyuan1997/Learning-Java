package chapter9.chapter9_4;

class MyThread0 extends Thread{
	private int time;
	public MyThread0(String name, int time) {
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

public class ExecDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread0 mt1 = new MyThread0("线程A",10000);
		MyThread0 mt2 = new MyThread0("线程B",20000);
		MyThread0 mt3 = new MyThread0("线程C",30000);
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}

}
