package chapter19.chapter19_2;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url = new URL("http","www.mldnjava.cn",80,"/curriculum.htm");
		InputStream input = url.openStream();
		Scanner scan = new Scanner(input);
		scan.useDelimiter("\n");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
	}

}
