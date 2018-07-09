package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class EchoClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket client = null;
		client = new Socket("localhost",8888);
		PrintStream out = null;
		BufferedReader buf = null;
		BufferedReader input = null;
		input = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(client.getOutputStream());
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		boolean flag = true;
		while(flag) {
			System.out.println(" ‰»Î–≈œ¢");
			String str = input.readLine();
			out.println(str);
			if("bye".equals(str)) {
				flag = false;
			}else {
				String echo = buf.readLine();
				System.out.println(echo);
			}
		}
		client.close();
		buf.close();
	}
}
