package FactoryModel;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanFactory factory = new HumanFactory();
		Human male = factory.createHuman("male");
		male.eat();
		male.beat();
		male.sleep();
	}

}
