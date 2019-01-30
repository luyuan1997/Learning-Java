package p20190128;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 检测文件长度
 * @author Administrator
 *
 */
public class FileCount {
	public static void main(String[] args) throws IOException {
		int count = 0;
		InputStream streamReader = null;
		try {
			//FileInputStream是有缓冲区的，所以用完之后必须关闭，
			//否则可能导致内存占满，数据丢失
			streamReader = new FileInputStream("F:/fileTest.doc");
			while(streamReader.read() != -1) {
				count++;
			}
			System.out.println("---长度是： "+count+" 字节");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				streamReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
