package shape;

public class Circle extends Shape {
	private double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor() + "Ô²ÐÎ";
	}
	public static void main(String[] args) {
		Shape s1 = new Triangle("ºÚÉ«",3,4,5);
		Shape s2 = new Circle("»ÆÉ«",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}

}
