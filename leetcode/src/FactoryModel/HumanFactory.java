package FactoryModel;

public class HumanFactory {

	public Human createHuman(String gender) {
		if(gender.equals("male")) {
			return new Male();
		}else if(gender.equals("female")) {
			return new Female();
		}else {
			System.out.println("请输入正确的性别");
			return null;
		}
	}
}
