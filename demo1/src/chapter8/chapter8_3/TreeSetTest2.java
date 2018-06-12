package chapter8.chapter8_3;

import java.util.TreeSet;

class Z implements Comparable{
	int age;
	public Z(int age) {
		this.age = age;
	}
	//重写equals()方法，总是返回true
	public boolean equals(Object obj) {
		return true;
	}
	//重写comparableTo(Object obj)方法，总是返回1
	public int compareTo(Object obj) {
		return 1;
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//第二次添加同样的元素,输出为true，表明添加成功
		System.out.println(set.add(z1));
		System.out.println(set);
		//修改set集合的第一个元素的age变量
		((Z)(set.first())).age = 9;
		//此时两个元素均为9，原因在于在集合中，储存时作为同一个元素进行存储，因此一起被更改
		System.out.println(((Z)(set.last())).age);
	}

}
