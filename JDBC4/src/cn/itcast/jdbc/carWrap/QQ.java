package cn.itcast.jdbc.carWrap;

public class QQ implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("qq在慢悠悠行驶");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("成功刹车");
	}

}
