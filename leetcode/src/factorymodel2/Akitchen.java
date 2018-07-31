package factorymodel2;

class Akitchen implements KitchenFactory{

	public Food getFood() {
		return new Apple();
	}
	
	public TableWare getTableWare() {
		return new Knife();
	}

}