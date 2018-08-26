package cn.itcast.jdbc.carWrap;

public class CarWrap implements Car {

	private Car car;

	public CarWrap(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		System.out.println("增加了一块电池");
		System.out.println("我终于可以秒速破百了......");
	}

	@Override
	public void stop() {
		car.stop();

	}

}
