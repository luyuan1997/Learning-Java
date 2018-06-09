package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		//调用forEach()方法遍历集合
		books.forEach(obj -> System.out.println("迭代集合元素："+obj));
	}

}
