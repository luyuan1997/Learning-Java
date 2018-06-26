package chapter10.chapter10_2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoClose {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try (
			//声明、初始化两个可关闭的资源
			//try语句会自动关闭这两个资源
			BufferedReader br = new BufferedReader(new FileReader("AutoClose.java"));
			PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))
		){
			//使用两个资源
			System.out.println(br.readLine());
			ps.println("庄生晓梦迷蝴蝶");
		}
	}

}
