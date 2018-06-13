package chapter8.chapter8_4;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;

class A{
	public boolean equals(Object obj) {
		return true;
	}
}

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add(new String("轻量级JAVA EE企业应用实战"));
		books.add(new String("疯狂java讲义"));
		books.add(new String("疯狂ANDROID讲义"));
		System.out.println(books);
		//删除集合中的A对象，将导致一地个元素被删除
		books.remove(new A());
		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
	}

}
