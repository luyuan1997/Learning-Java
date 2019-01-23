package p20190122;

public class ABCPrinter {
	
	private final static Object lock = new Object();
	
	static class Print implements Runnable{
		private int max_print;
		private int count = 0;
		private String str = "A";
		
		public Print(int max_print) {
			this.max_print = max_print;
		}
		
		@Override
		public void run() {
			synchronized(lock) {
				String name = Thread.currentThread().getName();
				while(count < max_print) {
					if(str.equals(name)) {
						System.out.print(name);
						if(str.equals("A")) {
							str = "B";
						} else if(str.equals("B")) {
							str = "C";
						} else {
							count++;
							str = "A";
						}
						lock.notifyAll();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Print print = new Print(15);
		new Thread(print, "A").start();
        new Thread(print, "B").start();
        new Thread(print, "C").start();
	}
}
