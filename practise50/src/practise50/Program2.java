package practise50;
/**
 *判断101-200之间有多少个素数，并输出所有素数。

    * 素数是：只能被1或本身整除的数，如：3,5,7,11,131... 
      *判断素数的方法：用一个数分别去除2到sqrt(这个数)，
      *如果能被整除，则表明此数不是素数，反之是素数。
 * @author lu
 *
 */

public class Program2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=100; i<200; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				sum++;
				if(sum%10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("素数的个数:"+sum);
	}
	private static boolean isPrime(int n) {
		for(int j=2; j<Math.sqrt(n); j++) {
			if(n % j == 0) {
				return false;
			}
		}
		return true;
	}
}
