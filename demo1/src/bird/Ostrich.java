package bird;

public class Ostrich extends Bird {
	public void fly() {
		System.out.println("我只能在地上奔跑...");
	}
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.weight = 1000;
		bird.fly();
		bird.eat();
	}
}
