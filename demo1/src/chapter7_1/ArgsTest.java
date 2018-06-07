package chapter7_1;

public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出args数组的长度
		System.out.println(args.length);
		//遍历args数组的每个元素
		for(String arg : args) {
			System.out.println(arg);
		}
	}
}

