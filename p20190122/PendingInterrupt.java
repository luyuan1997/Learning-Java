package p20190122;

public class PendingInterrupt {
	public static void main(String[] args) {
		if(args.length >0) {
			Thread.currentThread().interrupt();
		}
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
			System.out.println("was NOT interrupted");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("elapsedTime=" + ( System.currentTimeMillis() - startTime));
	}
}
