package chapter6_8;

import chapter6_6.ProcessArray;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessArray pa = new ProcessArray();
		int[] target = {3,-4,6,4};
		//处理数组，具体处理行为取决于匿名内部类
//		pa.process(target, new Command() {
//			public void process(int[] target) {
//				int sum = 0;
//				for (int tmp : target) {
//					sum += tmp;
//				}
//				System.out.println("数组元素的总和是："+sum);
//			}
//		});
	}

}
