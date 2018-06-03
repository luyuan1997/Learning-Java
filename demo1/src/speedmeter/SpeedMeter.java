package speedmeter;

public abstract class SpeedMeter {
	//转速
	private double turnRate;
	public SpeedMeter() {}
	//把返回车轮半径的方法定义为抽象方法
	public abstract double getRadius();
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
	//定义计算速度的通用算法
	public double getSpeed() {
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}
