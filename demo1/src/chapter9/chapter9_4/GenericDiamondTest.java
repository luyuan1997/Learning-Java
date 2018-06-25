package chapter9.chapter9_4;

class Myclass<E>{
	public <T> Myclass(T t){
		System.out.println("t参数的值为："+t);
	}
}

public class GenericDiamondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Myclass类声明中的E形参为String类型
		//泛型构造器中声明的T形参为Integet类型
		Myclass<String> mc1 = new Myclass<>(5);
		//显示指定泛型构造器中声明的T形参是Integer类型
		Myclass<String> mc2 = new <Integer> Myclass<String>(5);
		//Myclass类声明中的E形参是String类型
		//如果显式制定泛型构造器中声明的T形参是Integer类型
		//此时就不能使用“菱形”语法，下面语法就会出现错误
//		Myclass<String> mc3 = new <Integer> Myclass<>(5);
	}

}
