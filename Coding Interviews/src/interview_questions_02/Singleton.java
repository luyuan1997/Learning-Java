package interview_questions_02;

public class Singleton {

	private static class SingletonHandler{
		public static Singleton newInstance = new Singleton();
	}
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		return SingletonHandler.newInstance;
	}
}
