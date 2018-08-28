package cn.itcast.reflect;

public class HelloMyServlet {
	public void add() {
		System.out.println("空参add方法");
	}
	public void add(int i, int j) {
		System.out.println("带有两个参数的add方法");
		System.out.println(i+j);
	}
	public int add(int i) {
		return i+10;
	}
}
