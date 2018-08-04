package petShop;

public class Cat implements Pet{

	private String name;
	private String color;
	private int age;
	public Cat(String name, String color, int age) {
		this.setName(name);
		this.setColor(color);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
