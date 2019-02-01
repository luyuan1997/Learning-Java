package p20190201.bridge;

public abstract class Restaurant {
	protected EatFood eatFood;

	public Restaurant(EatFood eatFood) {
		this.eatFood = eatFood;
	}
	
	public abstract String action();
}
