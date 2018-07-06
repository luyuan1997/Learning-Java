package chapter16Annotation.chapter16_2.c2;

@Deprecated
class Demo2{
	public String getInfo() {
		return "这是一个Person类";
	}
}

public class DeprecatedAnnotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		System.out.println(d.getInfo());
	}

}
