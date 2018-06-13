package chapter8.chapter8_4;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;


public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add(new String("轻量级JAVA EE企业应用实战"));
		books.add(new String("疯狂java讲义"));
		books.add(new String("疯狂ANDROID讲义"));
		System.out.println(books);
		//插入到第二个位置
		books.add(1, new String("疯狂AJAX讲义"));
		for(int i=0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//删除第三个元素
		books.remove(2);
		System.out.println(books);
		//判断置顶元素在集合中的位置
		System.out.println(books.indexOf(new String("疯狂java讲义")));
		//替换第二个元素
		books.set(1, new String("疯狂JAVA讲义"));
		System.out.println(books);
		//截取大于等于第二个元素到小于等于第三个元素的子集
		System.out.println(books.subList(1,2));
	}

}
