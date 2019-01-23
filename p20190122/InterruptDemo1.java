package p20190122;

public class InterruptDemo1 {
	public static void main(String[] args) {
		try {
			Thread t1 = new MyThread("t1");
			System.out.println(t1.getName() +" ("+t1.getState()+") is new.");
			
			t1.start();
			System.out.println(t1.getName() +" ("+t1.getState()+") is started.");
			Thread.sleep(3000);
			t1.interrupt();
			System.out.println(t1.getName() +" ("+t1.getState()+") is interrupted.");
			
			Thread.sleep(3000);
			System.out.println(t1.getName() +" ("+t1.getState()+") is interrupted now.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
