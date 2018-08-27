package practise50;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；

程序分析：关键是计算出每一项的值。

      比如获取的数字为：a，出现的项数为：n

      总结一下，可以得到一下规律：

       1、第一项有一个a,最后一项有n个a

        2、 第1和第2项相差2*10，第2和第三项相差2*100，第k和第k+1项相差2*（10的k次方）
 * @author lu
 *
 */

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入a的值:");
		a=scanner.nextInt();
		System.out.println("请输入n的值:");
		n=scanner.nextInt();
		int[] arr=new int[n];//创建数组长度为输入的项数
		int i = 1;//while循环初始化的值
		arr[0] = a;//数组的第一个值为a；
		//把每一个项的值赋值给数组里面的数
		while(i<n) {
			a *= 10;
			arr[i] = a + arr[i-1];
			i++;
		}
		int sum=0;
		for(int s:arr) {
			sum += s;
			if(s == arr[n-1]) {
				System.out.print(s);
				break;
			}
			System.out.print(s+"+");
		}
		System.out.print("="+sum);
	}

}
