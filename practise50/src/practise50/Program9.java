package practise50;
/**
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。

判断完数的方法：

      *  利用for循环判断所有因数的和是否和输入的值是否相等，相等的话输出

      *  求因数的方法：

      *  （1）两个嵌套循环，并用i%j==0,关于i和j的值范围：i从1到1000逐个遍历，j只需不大于i/2+1即可

      *  比如：48，最大的因数才24,99最大的因数是33，因数不会大于本身数的一半

      *  （2）j就是我们所求的因数，把所有的j相加，就可以得到因数总和

      *  （3）因数总和已经包含1了，因为第一次就保存1了
 * @author lu
 *
 */

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1000以内的因数有:");
		for(int i=1; i<=1000; i++) {
			int sum=0;
			for(int j=1; j<i/2+1; j++) {
				if(i%j==0) {
					sum = sum+j;
					if(i==sum) {
						System.out.println(i+" ");
					}
				}
			}
		}
	}

}
