package p20190201.bridge;

public class ShangriLa extends Restaurant {

	public ShangriLa(EatFood eatFood) {
		super(eatFood);
	}

	@Override
	public String action() {
		return "在香格里拉吃饭" + eatFood.eat();
	}
}
