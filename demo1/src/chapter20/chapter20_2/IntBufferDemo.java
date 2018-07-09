package chapter20.chapter20_2;
import java.nio.IntBuffer;

public class IntBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer buf = IntBuffer.allocate(10);//开辟10个缓冲区
		System.out.print("1.写入数据之前的position/limit和capacity:");
		System.out.println("position="+buf.position()+",limit="+buf.limit()+",capacity="+buf.capacity());
		int temp[] = {5,7,9};
		buf.put(3);//想缓冲区写入数据
		buf.put(temp);
		System.out.println("2.写入数据之后的position/limit和capacity:");
		System.out.println("position="+buf.position()+",limit="+buf.limit()+",capacity="+buf.capacity());
		buf.flip();//重设缓冲区
		System.out.print("3.准备输出数据时的position/limit和capacity:");
		System.out.println("position="+buf.position()+",limit="+buf.limit()+",capacity="+buf.capacity());
		System.out.println("缓冲区中的内容");
		while(buf.hasRemaining()) {
			int x = buf.get();
			System.out.println(x+"、");
		}
	}

}
