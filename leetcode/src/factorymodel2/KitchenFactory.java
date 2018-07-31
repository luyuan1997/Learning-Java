package factorymodel2;
//抽象工厂类
public interface KitchenFactory {

	public Food getFood();
	
	public TableWare getTableWare();
}
