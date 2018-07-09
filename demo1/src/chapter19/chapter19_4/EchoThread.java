package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class EchoThread implements Runnable{
	private Socket client = null;
	public EchoThread(Socket client) {
		this.client = client;
	}
	public void run() {
		PrintStream out =null;
		BufferedReader buf = null;
		try {
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
		}catch(Exception e) {
			
		}
		
	}

}
