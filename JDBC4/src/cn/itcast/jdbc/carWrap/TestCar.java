package cn.itcast.jdbc.carWrap;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQ qq = new QQ();
		qq.run();
		qq.stop();
		
		CarWrap wrap = new CarWrap(qq);
		wrap.run();
		wrap.stop();
	}

}
