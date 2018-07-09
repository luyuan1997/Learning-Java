package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class HelloClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket client = null;
		client = new Socket("localhost",8888);
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str = buf.readLine();
		System.out.println("服务器端输出的内容："+str);
		client.close();
		buf.close();
	}

}
