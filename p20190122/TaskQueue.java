package p20190122;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue<T> {
	private static final int MAX_TASKS = 1000;
	private BlockingQueue<T> queue = new LinkedBlockingQueue<>(MAX_TASKS);
	
	public void putTask(T r) throws InterruptedException {
		queue.put(r);
	}
	public T getTask() throws InterruptedException{
		return queue.take();
	}
}
