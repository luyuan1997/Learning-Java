package chapter6_6;

public class AddCommand {
	public void process(int[] target) {
		int sum = 0;
		for(int tmp : target) {
			sum += tmp;
		}
		System.out.println("数组元素的总和是："+sum);
	}
}
