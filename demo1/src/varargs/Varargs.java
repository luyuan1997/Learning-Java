package varargs;

public class Varargs {
	/**
	 * 采用可变形参，如果遇到重载情况时，调用过程中不可能通过直接传入一个字符串参数，只能处于形参列表的最后，也就是说，
	 * 一个方法中只能有一个长度可变的形参。因此建议采用数组形参形式
	public static void test(int a, String... books) {
		for(String book:books) {
			System.out.println(book);
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		test(5,"疯狂挂的java讲义","轻量级java");
	}
	**/
	//采用数组形参，调用时必须传入一个数组，建议采用这种方式
	public static void test(int a, String[] books) {
		for(String book:books) {
			System.out.println(book);
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		test(5, new String[] {"疯狂挂的java讲义","轻量级java"});
	}
}
