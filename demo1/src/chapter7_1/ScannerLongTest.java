package chapter7_1;

import java.util.Scanner;

public class ScannerLongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in代表键盘输入
		Scanner sc = new Scanner(System.in);
		//判断是否还有下一个long型整数
		while (sc.hasNextLong()) {
			System.out.println("键盘输入的内容是："+sc.nextLong());
		}
	}

}
