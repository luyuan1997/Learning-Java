package chapter7_3;

import java.util.Objects;

public class ObjectsTest {
	//定义一个obj变量，默认值为null
	static ObjectsTest obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出一个null对象的hashCode值，输出为0
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString，输出为null
		System.out.println(Objects.toString(obj));
		//要求obj不能为null，如果obj为null则引发异常
		System.out.println(Objects.requireNonNull(obj, "obj参数不能为Null"));
	}

}
