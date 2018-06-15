package chapter9.chapter9_4;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
	//声明一个泛型方法，该泛型方法带一个T类型形参
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for(T o : a) {
			c.add(o);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		//下面代码中T代表Object类型
		fromArrayToCollection(oa, co);
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		//下面代码中的T代表了String类型
		fromArrayToCollection(sa, cs);
	}

}
