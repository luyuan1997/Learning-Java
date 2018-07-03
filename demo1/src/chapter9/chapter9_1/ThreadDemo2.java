package chapter9.chapter9_1;

class MyThread2 extends Thread{
	private String name;
	public MyThread2(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name+"运行,i="+i);
		}
	}
};

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt1= new MyThread2("线程A");
		MyThread2 mt2 = new MyThread2("线程B");
		mt1.start();
		mt2.start();
	}

}
