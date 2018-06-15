package chapter9.chapter9_2;

public class A1 extends Apple<String>{
	//正确重写了父类的方法、返回值
	//与父类Apple<String>返回值的完全相同
	public String getInfo() {
		return "子类"+super.getInfo();
	}
	/**
	 * 下面的方法会出现错误，原因在于返回值类型不一致
	 */
//	public Object getInfo() {
//		return "子类";
//	}

}
