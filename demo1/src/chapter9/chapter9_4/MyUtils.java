package chapter9.chapter9_4;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class MyUtils {
	//下面dest集合元素的类型必须与src集合元素的类型相同，或者是其父类
	public static <T> T Copy(Collection<? super T> dest, Collection<T> src) {
		T last = null;
		for(T ele : src) {
			last = ele;
			dest.add(ele);
		}
		return last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		//此处可准确地知道最后一个被复制的元素时Integer类型
		//与src集合元素的类型相同
		Integer last = Copy(ln, li);
		System.out.println(ln);
		
	}

}
