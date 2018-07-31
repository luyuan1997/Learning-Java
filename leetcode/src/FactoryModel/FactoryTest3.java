package FactoryModel;

public class FactoryTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human male = HumanFctory3.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}

}
