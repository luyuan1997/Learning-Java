package p20190201.bridge;

public class Healton extends Restaurant {

	public Healton(EatFood eatFood) {
		super(eatFood);
	}

	@Override
	public String action() {
		return "在希尔顿酒店吃饭" + eatFood.eat();
	}
}
