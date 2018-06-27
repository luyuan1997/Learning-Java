package chapter10.chapter10_4;

public class Auction extends Exception{
	//无参数的构造器
	//自定义异常类应该继承Exception类，并且需要提供两个构造器
	public Auction() {}
	public Auction(String msg) {
		super(msg);
	}
}
