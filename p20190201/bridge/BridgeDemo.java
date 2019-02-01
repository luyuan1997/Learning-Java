package p20190201.bridge;

public class BridgeDemo {
	public static void main(String[] args) {
		Restaurant restaurant = new ShangriLa(new EatMeat());
		System.out.println(restaurant.action());
		
		Restaurant restaurant1 = new ShangriLa(new EatSalad());
		System.out.println(restaurant1.action());
	}
}
