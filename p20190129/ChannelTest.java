package p20190129;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {
	public static void main(String[] args) throws IOException {
		try {
			//FileChannel只能通过流的Channel获得
			RandomAccessFile aFile = new RandomAccessFile("F:/ptest3.txt", "rw");
			FileChannel inChannel = aFile.getChannel();
			ByteBuffer buf = ByteBuffer.allocate(100);
			int bytesRead = inChannel.read(buf);
			while(bytesRead != -1) {
				System.out.println();
				System.out.println("Read " + bytesRead);
				
				buf.flip();
				byte[] bytes = new byte[bytesRead];
				int index = 0;
				while(buf.hasRemaining()) {
					bytes[index] = buf.get();
					index++;
				}
				System.out.println(new String(bytes, "utf-8"));
				buf.clear();//清空buf中的数据
				bytesRead = inChannel.read(buf);//会把通道中的数据再次读入到buf中,返回-1无数据可读退出循环体
			}
			//RandomAccessFile的close方法会将对应的非空channel关闭。
			//因此无需单独关闭FileChannel
			aFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void TransferFromDemo() throws IOException {
		RandomAccessFile fromFile = new RandomAccessFile("F:/ptest3.txt", "rw");
		FileChannel fromChannel = fromFile.getChannel();
		RandomAccessFile toFile = new RandomAccessFile("F:/ptest4.txt", "rw");
		FileChannel toChannel = toFile.getChannel();
		long position = 0;
		long count = fromChannel.size();
		toChannel.transferFrom(fromChannel, position, count);
	}
	
	static void TransferToDemo() throws IOException {
		RandomAccessFile fromFile = new RandomAccessFile("F:/ptest4.txt", "rw");
		FileChannel fromChannel = fromFile.getChannel();
		RandomAccessFile toFile = new RandomAccessFile("F:/ptest3.txt", "rw");
		FileChannel toChannel = toFile.getChannel();
		long position = 0;
		long count = fromChannel.size();
		fromChannel.transferTo(position, count, toChannel);
	}
}
