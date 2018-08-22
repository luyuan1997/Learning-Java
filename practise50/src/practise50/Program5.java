package practise50;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 * @author lu
 *
 */
public class Program5 {

	public static void main(String[] args) {
		System.out.println("请输入您的分数");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String belong = input>=90?"A":(input>=60?"B":"C");
		System.out.println(input+"分属于:"+belong);
		scanner.close();
	}

}
