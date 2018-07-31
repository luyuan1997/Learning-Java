package FactoryModel;

public class FactoryTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanFactory2 factory = new HumanFactory2();
		Human male = factory.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}

}
