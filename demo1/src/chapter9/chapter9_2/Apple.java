package chapter9.chapter9_2;



public class Apple<T> {
	private T info;
	public Apple() {};
	public Apple(T info) {
		this.info = info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public T getInfo() {
		return this.info;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//由于T形参是String类型，因此，构造器参数只能是字符串型
		Apple<String> al = new Apple<>("苹果");
		System.out.println(al.getInfo());
		//由于传给T形参的是Double，所以构造器参数必须是Double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}

}
