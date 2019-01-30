package p20190128;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 文件复制
 * @author Administrator
 *
 */
public class FileCopy {
	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[512];//一次取出的字节数大小,缓冲区大小
		int numberRead = 0;
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream("F:/fileTest.doc");
			output = new FileOutputStream("F:/fileTest2.doc");
			////numberRead的目的在于防止最后一次读取的字节小于buffer长度
			while((numberRead = input.read(buffer)) != -1) {
				output.write(buffer, 0, numberRead);//否则会自动被填充0 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
			output.close();
		}
	}
}
