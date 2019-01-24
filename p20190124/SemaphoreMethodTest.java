package p20190124;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SemaphoreMethodTest {
	private int a = 0;
	
	class Bank{
		private int account = 100;

		public int getAccount() {
			return account;
		}
		public void save(int money) {
			account += money;
		}
	}
	
	class NewThread implements Runnable{
		private Bank bank;
		private Semaphore semaphore;
		
		public NewThread(Bank bank, Semaphore semaphore) {
			super();
			this.bank = bank;
			this.semaphore = semaphore;
		}

		@Override
		public void run() {
			int b = a++;
			if(semaphore.availablePermits() > 0) {
				System.out.println("线程" + b + "启动，进入银行,有位置立即去存钱");
			} else {
				System.out.println("线程" + b + "启动，进入银行,无位置，去排队等待等待");
			}
			try {
				semaphore.acquire();
				bank.save(10);
				System.out.println(b + "账户余额为：" + bank.getAccount());
				Thread.sleep(1000);
				System.out.println("线程" + b + "存钱完毕，离开银行");
				semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void useThread() {
		Bank bank = new Bank();
		Semaphore semaphore = new Semaphore(2);
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i = 0; i <10; i++) {
			es.submit(new Thread(new NewThread(bank, semaphore)));
		}
		es.shutdown();
		
		semaphore.acquireUninterruptibly(2);
		System.out.println("到点了，工作人员要吃饭了");
		semaphore.release(2);
	}
	public static void main(String[] args) {
		SemaphoreMethodTest test = new SemaphoreMethodTest();
		test.useThread();
	}
}
