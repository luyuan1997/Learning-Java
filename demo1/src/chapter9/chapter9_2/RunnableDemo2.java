package chapter9.chapter9_2;

class MyThread3 implements Runnable{
	private int ticket = 5;
	public void run() {
		for(int i=0; i<100; i++) {
			if(ticket>0) {
				System.out.println("ÂôÆ±£ºticket="+ticket--);
			}
		}
	}
}

public class RunnableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 my = new MyThread3();
		new Thread(my).start();
		new Thread(my).start();
		new Thread(my).start();
	}

}
