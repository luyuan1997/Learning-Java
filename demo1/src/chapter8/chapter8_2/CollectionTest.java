package chapter8.chapter8_2;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		//添加元素
		c.add("孙悟空");
		//虽然集合里面不能放基本类型的值，但Java支持自动装箱
		c.add(6);
		System.out.println("c集合的元素个数为："+c.size());
		//删除指定元素
		c.remove(6);
		System.out.println("c集合的元素个数为："+c.size());
		//判断是否包含指定字符串
		System.out.println("c集合是否包含\"孙悟空\"字符串："+c.contains("孙悟空"));
		
	}

}
