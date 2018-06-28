package chapter10.chapter10_4;

public class SalException extends Exception{
	public SalException() {};
	public SalException(String msg) {
		super(msg);
	}
	//创建可以接收Throwable参数的构造器
	public SalException(Throwable t) {
		super(t);
	}
}
