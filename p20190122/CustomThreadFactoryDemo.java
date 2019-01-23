package p20190122;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactoryDemo {

	public static void main(String[] args) {
		ThreadFactory customThreadFactory = new CustomThreadFactoryBuilder()
				.setNamePrefix("DemoPool-Thread").setDaemon(false)
				.setPriority(Thread.MAX_PRIORITY).build();
		ExecutorService executorService = Executors.newFixedThreadPool(3, customThreadFactory);
		
		SimpleTask simpleTask1 = new SimpleTask(1000); 
		SimpleTask simpleTask2 = new SimpleTask(1000); 
		SimpleTask simpleTask3 = new SimpleTask(1000); 
		
		// Execute three simple tasks with 1000 ms sleep time 
		executorService.execute(simpleTask1); 
		executorService.execute(simpleTask2); 
		executorService.execute(simpleTask3);
	}
}
