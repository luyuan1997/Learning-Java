package chapter8.chapter8_3;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet books = new LinkedHashSet();
		books.add("疯狂JAVA讲义");
		books.add("轻量级JavaEE企业应用实战");
		System.out.println(books);
		//删除 疯狂JAVA讲义
		books.remove("疯狂JAVA讲义");
		//重新添加疯狂JAVA讲义
		books.add("疯狂JAVA讲义");
		System.out.println(books);
	}

}
