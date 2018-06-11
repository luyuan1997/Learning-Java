package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("疯狂Android讲义")) {
				//使用Iterator迭代过程中，不可修改集合元素
				//下面的代码会引发异常
				//Iterator迭代器采用快速失败机制(fail-fast)
				//一旦迭代器中检测到该集合已经被修改
				//程序立即引发ConcurrentModificationException异常
				//而不是修改后的结果
				//这可以避免共享资源引发的潜在问题
				books.remove(book);
			}
		}
	}

}
