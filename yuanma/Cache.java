package yuanma;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;

public class Cache<K, V> {

	public ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();
	public DelayQueue<DelayedItem<K>> queue = new DelayQueue<>();
	
	public void put(K k, V v, long liveTime) {
		V v2 = map.put(k, v);
		DelayedItem<K> tmpItem = new DelayedItem<K>(k, liveTime);
		if(v2 != null) {
			queue.remove(tmpItem);
		}
		queue.put(tmpItem);
	}
	
	public Cache() {
		Thread t = new Thread() {
			@Override
			public void run() {
				dameonCheckOverdueKey();
			}
		};
		t.setDaemon(true);
		t.start();
	}
	
	public void dameonCheckOverdueKey() {
		while(true) {
			DelayedItem<K> delayedItem = queue.poll();
			if (delayedItem != null) {
                map.remove(delayedItem.getT());
                System.out.println(System.nanoTime()+" remove "+delayedItem.getT() +" from cache");
            }
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                // TODO: handle exception
            }
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();
        int cacheNumber = 10;
        int liveTime = 0;
        Cache<String, Integer> cache = new Cache<String, Integer>();
        
        for (int i = 0; i < cacheNumber; i++) {
            liveTime = random.nextInt(3000);
            System.out.println(i+"  "+liveTime);
            cache.put(i+"", i, random.nextInt(liveTime));
            if (random.nextInt(cacheNumber) > 7) {
                liveTime = random.nextInt(3000);
                System.out.println(i+"  "+liveTime);
                cache.put(i+"", i, random.nextInt(liveTime));
            }
        }

        Thread.sleep(3000);
        System.out.println();
	}

}
