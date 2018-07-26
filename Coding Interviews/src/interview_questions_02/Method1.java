package interview_questions_02;

public class Method1 {
//实现singleton模式
	//饿汉模式
	private static Method1 instance = new Method1();//创建静态变量
	private Method1() {};//创建私有的构造器
	private static Method1 getInstance(){
		return instance;
	}
}
