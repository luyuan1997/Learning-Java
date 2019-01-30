package p20190128;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {
	public static void main(String[] args) throws IOException {
		String str = "hello,pushbackinputstream";
		PushbackInputStream push = null;// 声明回退流对象
		ByteArrayInputStream bat = null;// 声明字节数组流对象
		bat = new ByteArrayInputStream(str.getBytes());
		// 创建回退流对象，将拆解的字节数组流传入
		push = new PushbackInputStream(bat);
		int temp = 0;
		// push.read()逐字节读取存放在temp中，如果读取完成返回-1  
		while((temp = push.read()) != -1) {
			if(temp == ',') {// 判断读取的是否是逗号
				push.unread(temp);//回到temp的位置 
				temp = push.read();//接着读取字节
				// 输出回退的字符
				System.out.print("(回退" + (char) temp + ") ");
			} else {
				System.out.print((char)temp);//// 否则输出字符
			}
		}
	}
}
