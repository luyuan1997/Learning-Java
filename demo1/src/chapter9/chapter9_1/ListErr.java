package chapter9.chapter9_1;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;

public class ListErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个只想保存String类型的List集合
		List strList = new ArrayList();
		strList.add("Math");
		strList.add("English");
		//如果把Integer类型元素放入,就会因为强制转化为字符串类型报错
		strList.add(5);
		strList.forEach(str -> System.out.println(((String)str).length()));
	}

}
