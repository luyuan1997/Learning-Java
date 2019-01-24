package p20190123;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CachedData{
	Object data;
	volatile boolean cacheValid;//缓存是否有效
	ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	void processCachedData() {
		rwl.readLock().lock();//获取读锁
		//如果缓存无效，更新cache;否则直接使用data
		if(!cacheValid) {
			//获取写锁前须释放读锁
			rwl.readLock().unlock();
			rwl.writeLock().lock();
			
			if(!cacheValid) {
				data = null;
				cacheValid = true;
			}
			
			//锁降级，在释放写锁前获取读锁
			rwl.readLock().lock();
			rwl.writeLock().unlock();
		}
		//data使用
		rwl.readLock().unlock();//释放读锁
	}
}