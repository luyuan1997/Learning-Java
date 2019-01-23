package yuanma;

public class Reflection {

	public static void main(String[] args) {
		//方式1
		Student1 stu1 = new Student1();//这一new 产生一个Student对象，一个Class对象。
		Class stuClass = stu1.getClass();
		System.out.println(stuClass.getName());
		
		//方式2
		Class stuClass2 = Student1.class;
		System.out.println(stuClass == stuClass2);
		
		try {
			Class stuClass3 = Class.forName("yuanma.Student1");
			System.out.println(stuClass3 == stuClass2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
