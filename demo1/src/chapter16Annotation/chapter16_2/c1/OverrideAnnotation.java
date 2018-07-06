package chapter16Annotation.chapter16_2.c1;
class Person{
	public String getInfo() {
		return "这是一个Person类";
	}
}

class Student extends Person{
	@Override
	public String getInfo() {
		return "这是一个Student类";
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Student();
		System.out.println(per.getInfo());
	}

}
