package interview_questions_02;

public class DoubleLockModel {

	//Ë«ÖØËøÄ£Ê½
	private static DoubleLockModel instance = new DoubleLockModel();
	private DoubleLockModel() {};
	public static DoubleLockModel getInstance() {
		if(instance == null) {
			synchronized (DoubleLockModel.class) {
				if(instance == null) {
					instance = new DoubleLockModel();
				}
			}
		}
		return instance;
	}
}
