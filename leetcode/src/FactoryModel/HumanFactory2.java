package FactoryModel;

public class HumanFactory2 {

	public Male createMale() {
		return new Male();
	}
	
	public Female createFemale() {
		return new Female();
	}
}
