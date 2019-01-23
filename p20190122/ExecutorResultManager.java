package p20190122;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorResultManager {

	public static void main(String[] args) {
		//队列
		final BlockingQueue<Future<String>> futures = new LinkedBlockingQueue<>();
		//生产者
		new Thread() {
			@Override
			public void run() {
				ExecutorService pool = Executors.newCachedThreadPool();
				for(int i = 0; i < 10; i++) {
					final int index = i;
					Future<String> submit = pool.submit(new Callable<String>() {
						@Override
						public String call() throws Exception {
							return "task done" + index;
						}
					});
					try {
						futures.put(submit);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		//消费者
		new Thread() {
			@Override
			public void run() {
				while(true) {
					for(Future<String> future : futures) {
						if(future.isDone()) {
							//处理业务
//							。。。
						}
					}
				}
			}
		}.start();
	}
}
