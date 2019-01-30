package p20190128;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
	public static void main(String[] args) {
		doSequence();
	}

	private static void doSequence() {
		// 创建一个合并流的对象
		SequenceInputStream sis = null;
		// 创建输出流
		BufferedOutputStream bos = null;
		try {
			Vector<InputStream> vector = new Vector<>();
			vector.addElement(new FileInputStream("F:/ptest.txt"));
			vector.addElement(new FileInputStream("F:/ptest1.txt"));
			vector.addElement(new FileInputStream("F:/ptest2.txt"));
			Enumeration<InputStream> e = vector.elements();
			
			sis = new SequenceInputStream(e);
			
			bos = new BufferedOutputStream(new FileOutputStream("F:/ptest3.txt"));
			//读写数据
			byte[] buff = new byte[1024];
			int len = 0;
			while((len = sis.read(buff)) != -1) {
				bos.write(buff, 0, len);
				bos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis != null) {
					sis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
