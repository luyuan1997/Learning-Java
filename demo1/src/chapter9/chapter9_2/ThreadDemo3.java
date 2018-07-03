package chapter9.chapter9_2;


class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name+"运行,i="+i);
		}
	}
};

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("线程A");
		mt1.start();
		mt1.start();
	}
}
