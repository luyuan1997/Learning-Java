package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class EchoServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null;
		BufferedReader buf = null;
		server = new ServerSocket(8888);
		boolean f = true;
		while(f) {
			System.out.println("服务器正在运行，等待客户端链接");
			client = server.accept();
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintStream(client.getOutputStream());
			boolean flag = true;
			while(flag) {
				String str = buf.readLine();
				if(str == null || "".equals(str)) {
					flag = false;
				}else {
					out.println("ECHO:"+str);
				}
			}
			out.close();
			client.close();
		}
		server.close();
	}
};
