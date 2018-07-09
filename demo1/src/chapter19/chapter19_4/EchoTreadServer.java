package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class EchoTreadServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server =null;//定义对象
		Socket client = null;//对弈对象，表示客户端
		server = new ServerSocket(8888);//服务器在8888接口监听
		boolean f = true;//定义标记位
		while(f) {
			System.out.println("服务器运行，等待客户端连接");
			client = server.accept();
			new Thread(new EchoThread(client)).start();
		}
		server.close();
	}

}
