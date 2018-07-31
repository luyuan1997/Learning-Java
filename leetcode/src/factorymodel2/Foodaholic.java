package factorymodel2;

public class Foodaholic {
	
	public void eat(KitchenFactory k) {
		System.out.println("A foodaholic is eating "+k.getFood().getFoodName()
				+"with"+k.getTableWare().getToolName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Foodaholic fh = new Foodaholic();
		KitchenFactory kf = new Akitchen();
		fh.eat(kf);
	}

}
