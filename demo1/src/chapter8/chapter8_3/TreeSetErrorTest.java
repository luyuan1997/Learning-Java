package chapter8.chapter8_3;

import java.util.TreeSet;
import java.util.Date;


public class TreeSetErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		//向TreeSet集合中添加三个元素
		//当添加第二个元素时，由于CompareTo(Object obj)强制将两种对象转化为同一种类型进行计较
		//因此引发异常
		//如果希望TreeSet正常运行，必须只能添加一种类型的对象
		ts.add(new String("疯狂JAVA讲义"));
		ts.add(new Date());
		System.out.println(ts);
	}

}
