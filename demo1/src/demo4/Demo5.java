package demo4;

public class Demo5 {
//	public void info() {
//		System.out.println("简单的info方撒");
//	}
	
	public static void main(String[] args) {
		Demo4 dog = new Demo4();
		dog.run();
		
		//因为main（）方法是静态方法，二info()是费静态方法
		//调用mian()方法的是该类本身，而不是该类的实例
		//因此，省略的this无法指向有效的对象
		//info();
		
		
	}
}
