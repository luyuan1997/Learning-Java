package practise50;

import java.util.Scanner;

/**
 *题目：输入某年某月某日，判断这一天是这一年的第几天？
 *程序分析：以3月5日为例，应该先把前两个月的加起来
 *然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 *闰年的条件：year除以400能整除，或者year除以4能整除，但是不能是100的倍数
 * @author lu
 *
 */

public class Program14 {

	public static void main(String[] args) {
		System.out.println("请输入年月日(用空格隔开):");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int mouth = scanner.nextInt();
		int day = scanner.nextInt();
		int sum=0;
		int[] arr= {31,28,31,30,31,30,31,30,31,30,31};
		for(int i=1; i<mouth; i++) {
			sum += arr[i];
		}
		boolean isRight=(((year%4==0)&&(year%100!=0))||(year%400==0))&&(mouth>2);
		if(isRight) {
			sum+=1;
		}
		System.out.println(year+"年"+mouth+"月"+day+"日,是今年的第"+sum+"天");
	}

}
