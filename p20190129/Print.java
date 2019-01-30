package p20190129;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Print {
	public static void main(String[] args) throws Exception {
		char[] buffer = new char[512];
		int numberRead = 0;
		FileReader reader = null;
		PrintWriter writer = null;
		try {
			reader = new FileReader("F:/ptest3.txt");
			//PrintWriter可以输出字符到文件，也可以输出到控制台
			writer = new PrintWriter(System.out);
			
			while((numberRead = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, numberRead);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			reader.close();
			writer.close();
		}
	}
}
