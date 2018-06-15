package chapter9.chapter9_4;

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

	}

}
