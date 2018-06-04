package chapter6_6;

public class PrintCommand {
	public void process(int[] target) {
		for(int tmp : target) {
			System.out.println("迭代输出目标数组的元素："+tmp);
		}
	}
}
