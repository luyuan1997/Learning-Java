package tostringtest;

class Apple{
	private String color;
	private double weight;
	public Apple() {}
	public Apple(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}
	public String toString() {
		return "一个苹果，颜色是："+color+",重量是："+weight;
	}
}
public class ToStringTest {
	public static void main(String[] args) {
		Apple a = new Apple("红色",5.68);
		System.out.println(a);
	}
}
