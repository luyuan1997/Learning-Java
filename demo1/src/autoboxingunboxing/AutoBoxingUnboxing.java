package autoboxingunboxing;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		//直接把一个基本类型变量赋值给Integer对象
		Integer inObj = 5;
		//直接把一个boolean类型变量赋值给一个Object类型的变量
		Object boolObj = true;
		//直接把一个Integer对象赋值给int类型的变量
		int it = inObj;
		if(boolObj instanceof Boolean) {
			//先把Object对象强制类型转化为Boolean类型，再赋值给boolean
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	}
}
