package chapter9.chapter9_5;

import java.util.List;
import java.util.ArrayList;

public class ErasureTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li;
		//下面代码引起“未经检查的转换”警告，编译、运行时完全正常
		List<String> ls = list;
		//但只要访问ls里的元素，就会引起异常
//		System.out.println(ls.get(0));
	}

}
