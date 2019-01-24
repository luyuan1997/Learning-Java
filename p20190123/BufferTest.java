package p20190123;

public class BufferTest {

	public static void main(String[] args) {
		Buffer buffer=new Buffer(5);
	    Producer producer=new Producer(buffer);
	    Consumer consumer=new Consumer(buffer);
	    //创建线程执行生产和消费
	    for(int i=0;i<1;i++){
	        new Thread(producer,"producer-"+i).start();
	    }
	    for(int i=0;i<1;i++){
	        new Thread(consumer,"consumer-"+i).start();
	    }
	}

}