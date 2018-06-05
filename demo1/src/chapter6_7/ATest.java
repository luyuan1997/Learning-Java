package chapter6_7;
interface A{
	void test();
}
public class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		A a = new A() {
			public void test() {
				//在java8以前一下语句提示错误，age必须使用final修饰
				//从java8开始，匿名内部类、局部内部类允许访问非final的局部变量
				System.out.println(age);
			}
		};
		a.test();
	}

}
