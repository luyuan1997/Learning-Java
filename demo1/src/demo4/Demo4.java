package demo4;

public class Demo4 {
	public void jump() {
		System.out.println("正在执行jump方法");
	}
	public void run() {
//		Demo4 d = new Demo4();
//		d.jump();
		
//方法二：this代表的是Demo4
//		this.jump();
		
		
//方法三：Java允许对象的一个成员直接调用另一个成员，this可以省略，但是静态成员不能直接访问费静态成员
		jump();
		System.out.println("正在执行run方法");
	}
}
