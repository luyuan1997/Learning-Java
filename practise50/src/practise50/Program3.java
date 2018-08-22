package practise50;
/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * @author lu
 *
 */
public class Program3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=100; i<1000; i++) {
			int bite = i %10;
			int ten = i/10%10;
			int hundred = i/100;
			if(i==(bite*bite*bite)+(ten*ten*ten)+(hundred*hundred*hundred)) {
				System.out.print(i+" ");
				sum++;
				if(sum%10==0) {
					System.out.println();
				}
			}
		}
	System.out.println("共有水仙花数:"+sum);
	}

}
