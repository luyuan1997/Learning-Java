package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂IOS讲义");
		books.add("疯狂Ajax讲义");
		books.add("疯狂Android讲义");
		//使用Lambda表达式(目标类型是Predicate)过滤集合,进行批量删除
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}

}
