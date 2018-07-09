package chapter19.chapter19_2;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url = new URL("http://www.baidu.com");
		URLConnection urlCon = url.openConnection();
		System.out.println("内容大小："+urlCon.getContentLength());
		System.out.println("内容类型："+urlCon.getContentType());
	}

}
