package FactoryModel;

public class HumanFctory3 {

	public static Male createMale() {
		return new Male();
	}
	
	public static Female createFemale() {
		return new Female();
	}
}
