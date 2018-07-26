package interview_questions_02;

public class Singleton2 {

	private Singleton2() {};
	public static Singleton2 getInstance() {
		return Holder.instance;
	}
	private static class Holder{
		private static final Singleton2 instance = new Singleton2();
	}
}
