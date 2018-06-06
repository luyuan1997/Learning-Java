package chapter6_10;

import java.lang.ref.WeakReference;

public class ReferenceTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//创建一个字符串对象
		String str = new String("疯狂的java讲义");
		//创建一个弱引用，让此弱引用引用到str字符串
		WeakReference wr = new WeakReference(str);
		//切断str引用和"疯狂java讲义"字符串之间的引用
		str = null;
		//取出弱引用所引用的对象
		System.out.println(wr.get());
		//强制垃圾回收
		System.gc();
		System.runFinalization();
		//再次取出弱引用所引用的对象
		System.out.println(wr.get());
	}

}
