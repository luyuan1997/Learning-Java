package insanceoftest;

public class InstanceOfTest {
	public static void main(String[] args) {
		//声明hello时使用Object类，则hello的编译类型是Object
		//Object是所有类的父类，但hello变量的实际类型的String
		Object hello = "Hello";
		System.out.println("字符串是否是Object类的实例："
				+(hello instanceof Object));
		System.out.println("字符串是否是String类的实例："
				+(hello instanceof String));
		System.out.println("字符串是否是Math类的实例："
				+(hello instanceof Math));
		//String实现了Comparable接口
		System.out.println("字符串是否是Comparable接口的实例："
				+(hello instanceof Comparable));
	}
}
