package chapter8.chapter8_4;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List fixedList = Arrays.asList("疯狂java讲义","轻量级JAVA EE企业应用实战");
		System.out.println(fixedList.getClass());
		//遍历打印
		fixedList.forEach(System.out::println);
		//试图增加或者删除元素都会引发异常
		fixedList.add("疯狂ANDROID讲义");
		fixedList.add("疯狂IOS讲义");
	}

}
