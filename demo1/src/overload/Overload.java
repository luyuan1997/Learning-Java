//方法重载练习
package overload;

public class Overload {
	public void test() {
		System.out.println("无参数");
	}
	public void test(String msg) {
		System.out.println("只有一个参数的test方法");
	}
	public void test(String... books) {
		System.out.println("***形参个数可变的test方法***");
	}
	public static void main(String[] args) {
		Overload olv = new Overload();
		//如果将无参数的test方法直接去除，则下面两个都将按照形参个数可变的重载进行执行
		olv.test();
		olv.test("aa","bb");
		//调用执行一个参数的test方法
		olv.test("aa");
		//调用执行形参个数可变的test方法
		olv.test(new String[] {"aa"});
	}
}
