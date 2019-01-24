package p20190123;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
	private static Singleton instance;
	private static Lock lock = new ReentrantLock();
	
	public static Singleton getInstance() {
		lock.lock();
		try {
			if(instance == null) {
				instance = new Singleton();
			}
		} finally {
			lock.unlock();
		}
		return instance;
	}
}
