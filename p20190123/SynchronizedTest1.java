package p20190123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedTest1 {
	private static ReentrantLock lock = new ReentrantLock();
	static Condition condition1 = lock.newCondition();
	static Condition condition2 = lock.newCondition();
	
	
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				try {
					lock.lock();
					for(int i = 65; i < 91; i++) {
						System.out.println("----------thread1------- " + (char) i);
						condition2.signal();
						condition1.await();
					}
					condition2.signal();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				try {
					lock.lock();
					for(int i = 0; i < 26; i++) {
						System.out.println("----------thread2------- " + i);
						condition1.signal();
						condition2.await();
					}
					condition1.signal();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}.start();
	}
}