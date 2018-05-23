package section5_4;

public class Person {
	//使用private修饰成员变量，将这些成员变量隐藏起来
	private String name;
	private int age;
	public void setName(String name) {
		//执行合理性检验，要求用户名在2-6位之间
		if(name.length() > 10 || name.length() < 2) {
			System.out.println("您设置的人名不符合要求");
		} else {
			this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if(age > 100 || age <0 ) {
			System.out.println("您设置的年龄不合法");
		} else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
}
