package chapter6_8;

import chapter6_6.ProcessArray;

public class CommandTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,6,5};
		pa.process(array, (int[] target)->{
			int sum = 0;
			for(int tmp : target) {
				sum += tmp;
			}
			System.out.println("数组元素的总和是："+sum);
		});
	}

}
