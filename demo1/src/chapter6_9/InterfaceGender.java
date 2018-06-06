package chapter6_9;

public enum InterfaceGender implements GenderDesc{
	//此处的枚举值必须调用对应的构造器来创建
		MALE("男"),FEMALE("女");
		private final String name;
		//枚举类的构造器只能使用private修饰
		private InterfaceGender(String name) {
			this.name=name;
		}
		public String getName() {
			return this.name;
		}
		public void info() {
			System.out.println("这是一个用于定义性别的枚举类");
		}
}
