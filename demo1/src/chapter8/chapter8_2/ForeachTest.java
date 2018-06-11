package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		for(Object obj : books) {
			//此处的book变量也不是集合元素本身
			String book = (String)obj;
			System.out.println(book);
			if(book.equals("疯狂Android讲义")) {
				//下面将引发ConcurrentModificationException异常
				books.remove(book);
			}
		}
		System.out.println(books);
	}

}
