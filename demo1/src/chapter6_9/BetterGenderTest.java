package chapter6_9;

public class BetterGenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterGender g = BetterGender.valueOf("FEMALE");
		g.setName("女");
		System.out.println(g+"代表："+g.getName());
		//此时设置name值时将会提示参数错误
		//如果g设置的为MALE，则上面的为参数错误
		g.setName("男");
		System.out.println(g+"代表："+g.getName());
	}

}
