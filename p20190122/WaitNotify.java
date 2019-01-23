package p20190122;

import java.util.LinkedList;
import java.util.Queue;

public class WaitNotify {

	private final static int CONTAINER_MAX_LENGTH = 3;
	private static Queue<Integer> resources = new LinkedList<Integer>();
	
	//作为synchronized的对象监视器
	private static final Object lock = new Object();
	
	/**
	 * 消费者
	 * @param args
	 */
	static class Consumer implements Runnable{
		@Override
		public void run() {
			synchronized(lock) {
				// 不能使用if判断，防止过早唤醒
				while(resources.isEmpty()) {
					try {
						// 当前释放锁，线程进入等待状态
						lock.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "get number is" + resources.remove());
				// 唤醒所有等待状态的线程
				lock.notifyAll();
			}
		}
	}
	/**
	 * 生产者
	 * @author Administrator
	 *
	 */
	static class Producer implements Runnable{
		@Override
		public void run() {
			synchronized(lock) {
				while(resources.size() == CONTAINER_MAX_LENGTH) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int number = (int)(Math.random() * 100);
				System.out.println(Thread.currentThread().getName() + "produce number is" + number);
				resources.add(number);
				lock.notifyAll();
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			new Thread(new Consumer(), "consumer-" + i).start();
		}
		
		for(int i = 0; i < 50; i++) {
			new Thread(new Producer(), "producer-" + i).start();
		}
	}

}
