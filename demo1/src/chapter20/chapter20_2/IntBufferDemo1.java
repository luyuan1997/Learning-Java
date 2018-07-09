package chapter20.chapter20_2;
import java.nio.IntBuffer;

public class IntBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer buf = IntBuffer.allocate(10);//开辟10个缓冲区
		IntBuffer sub = null;//定义缓冲区对象
		for(int i=0; i<10; i++) {
			buf.put(2*i+1);
		}
		buf.position(2);//主缓冲区指针设置在第三个元素
		buf.limit(6);
		sub = buf.slice();
		for(int i=0; i<sub.capacity(); i++) {
			int temp = sub.get(i);
			sub.put(temp-1);
		}
		buf.flip();
		buf.limit(buf.capacity());
		System.out.println("缓冲区中的内容");
		while(buf.hasRemaining()) {
			int x = buf.get();
			System.out.println(x+"、");
		}
	}

}
