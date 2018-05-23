package constructor;

public class Apple {
	public String name;
	public String color;
	public double weight;
	public Apple() {}
	//两个参数的构造器
	public Apple(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//三个参数的构造器，直接调用了上面的构造器
	public Apple(String name, String color, double weight) {
		//通过this调用另外一个虫子啊的构造器的初始化代码
		this(name,color);
		this.weight = weight;
	}
}

