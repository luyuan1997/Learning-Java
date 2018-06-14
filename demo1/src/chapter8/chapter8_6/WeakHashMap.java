//package chapter8.chapter8_6;
//
//import java.util.HashMap;
//
//public class WeakHashMap {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WeakHashMap whm = new WeakHashMap();
//		whm.put(new String("Chinese"), new String("A"));
//		whm.put(new String("Math"), new String("B"));
//		whm.put(new String("English"), new String("C"));
//		whm.put("Java", new String("B"));
//		System.out.println(whm);
//		System.gc();
//		System.runFinalization();
//		System.out.println(whm);
//	}
//
//}
