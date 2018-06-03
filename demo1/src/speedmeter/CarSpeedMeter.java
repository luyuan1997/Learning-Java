package speedmeter;

public class CarSpeedMeter extends SpeedMeter {
	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0.28;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSpeedMeter csm = new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}

}
