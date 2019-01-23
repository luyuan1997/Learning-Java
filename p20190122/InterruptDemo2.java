package p20190122;

public class InterruptDemo2 {
	public static void main(String[] args) {
		try {
			Thread t2 = new MyThread1("t2");
			System.out.println(t2.getName() +" ("+t2.getState()+") is new.");
			
			t2.start();
			System.out.println(t2.getName() +" ("+t2.getState()+") is started.");
			Thread.sleep(3000);
			
			System.out.println(t2.getName() +" ("+t2.getState()+") is interrupted.");
			
			Thread.sleep(3000);
			System.out.println(t2.getName() +" ("+t2.getState()+") is interrupted now.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
