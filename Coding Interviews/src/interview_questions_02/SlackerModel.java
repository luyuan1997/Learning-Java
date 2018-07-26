package interview_questions_02;

public class SlackerModel {

	//ÀÁººÄ£Ê½
	private static SlackerModel instance = new SlackerModel();
	private SlackerModel() {};
	public static synchronized SlackerModel getInstance() {
		if(instance == null) {
			instance = new SlackerModel();
		}
		return instance;
	}
}
