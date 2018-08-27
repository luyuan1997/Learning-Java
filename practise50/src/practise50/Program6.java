package practise50;

import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

 *最大公约数和最小公倍数的求法  

 *1、先求最大公约数MaxCommonDivisor

 *2、就可以很方便获得最小公倍数MinCommonMultiple=input1*input2/MaxCommonDivisor

 *这里最重要的就是求最大公约数：求法如下 

 *(1)用大的数对小的数求余

 *(2)把小的数赋值给大的数，把求余获得的结果赋值给小的数，

 *(3)循环上一步的操作，直到求余的结果为零

 *(4)上一步被求余的数就是我们要的最大公约数，不信的话，你可以动手试试
 * @author lu
 *
 */

public class Program6 {

	public static void main(String[] args) {
		int MaxCommonDivisor = 0;
		int MinCommonMultiple = 0;
		System.out.println("请输入两个正整数");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		MinCommonMultiple = input1 * input2;
		int temp = 1;
		//保证第一个数不小于第二个数
		if(input2 > input1) {
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		
		while(temp != 0) {
			temp = input1 % input2;
			input1 = input2;
			input2 = temp;
		}
		
		MaxCommonDivisor = input1;
		MinCommonMultiple = MinCommonMultiple/MaxCommonDivisor;
		System.out.println("最大公约数为:"+MaxCommonDivisor);
		System.out.println("最小公倍数为:"+MinCommonMultiple);
	}
}
