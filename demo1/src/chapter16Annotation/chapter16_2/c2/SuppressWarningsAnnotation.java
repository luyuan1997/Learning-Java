package chapter16Annotation.chapter16_2.c2;
@Deprecated
class Demo3<T>{
	private T var;
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}
}

public class SuppressWarningsAnnotation {
	@SuppressWarnings({"unchecked", "deprecation"})
//	@SuppressWarnings(value={"unchecked", "deprecation"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d = new Demo3();
		d.setVar("李兴华");
		System.out.println("内容："+d.getVar());
	}

}
