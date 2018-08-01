package interview_questions_02;

public class Method1 {
//实现singleton模式
	//饿汉模式
	private static Method1 instance = new Method1();
	private Method1() {};
	private static Method1 getInstance() {
		return instance;
	}
	
}
