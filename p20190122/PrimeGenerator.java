package p20190122;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeGenerator implements Runnable {
	private static ExecutorService exec = Executors.newCachedThreadPool();
	
	private final List<BigInteger> primes = new ArrayList<>();
	//取消标志位
	private volatile boolean cancelled;
	
	@Override
	public void run() {
		BigInteger p = BigInteger.ONE;
		//每次在生成下一个素数时坚持是否取消
		//如果取消，则退出
		while(!cancelled) {
			p = p.nextProbablePrime();
			synchronized(this) {
				primes.add(p);
			}
		}
	}
	
	public void cancel() {
		cancelled = true;
	}
	
	public synchronized List<BigInteger> get(){
		return new ArrayList<BigInteger>(primes);
	}
	
	static List<BigInteger> aSecondOfPrimes(){
		PrimeGenerator generator = new PrimeGenerator();
		exec.execute(generator);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			generator.cancel();
		}
		return generator.get();
	}
}
