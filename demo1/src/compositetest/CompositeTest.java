package compositetest;
class Animal{
	private void beat() {
		System.out.println("心脏跳动...");
	}
	public void breath() {
		System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}
class Bird{
	//将原来的父类组合到原来的子类，作为子类的一个组合成分
	private Animal a;
	public Bird(Animal a) {
		this.a = a;
	}
	//重新定义一个自己的breath()方法
	public void breath() {
		a.breath();
		//直接复用Animal提供的breath()方法来实现Bird的breath()方法
	}
	public void fly() {
		System.out.println("我在天空自在的飞翔...");
	}
}

class Wolf{
	private Animal a;
	public Wolf(Animal a) {
		this.a = a;
	}
	public void breath() {
		a.breath();
	}
	public void run() {
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class CompositeTest {
	public static void main(String[] args) {
		Animal a1=new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		//此时需要显式创建被组合的对象
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
	}
}
