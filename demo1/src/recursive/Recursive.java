/**
 * 题目如下：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),求f(10)为典型的递归方法
 */

package recursive;

public class Recursive {
	public static int fn(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n ==1){
			return 4;
		}
		else {
			return 2*fn(n-1)+fn(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(fn(10));
	}
}
