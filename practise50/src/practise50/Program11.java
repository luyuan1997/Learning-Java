package practise50;
/**
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

程序分析：可填在百位、十位、个位的数字都是1、2、3、4。这里要用3个for循环

         用if判断条件是否符合，符合条件的数字打印出来,并计算个数总和
 * @author lu
 *
 */

public class Program11 {

	public static void main(String[] args) {
		int sum = 0;
		for(int bite=1; bite<5; bite++) {
			for(int ten=1; ten<5; ten++) {
				for(int hundred=1; hundred<5; hundred++) {
					if(bite!=ten&&ten!=hundred&&hundred!=bite) {
						System.out.print((hundred*100+ten*10+bite)+" ");
						sum++;
						if(sum%10==0) {
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("\n总共有:"+sum+"个这样的数");
	}

}
