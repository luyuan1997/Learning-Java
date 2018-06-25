package chapter9.chapter9_4;

class Foo{
	public <T> Foo(T t){
		System.out.println(t);
	}
}

public class GenericConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Foo("疯狂的Java讲义");
		new Foo(200);
		new <String> Foo("疯狂Android讲义");//制定T类型为String类型
//		new <String> Foo(12.3);不可以传入Double类型,不是String类型，因此报错
	}
}
