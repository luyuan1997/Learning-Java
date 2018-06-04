package chapter6_7;

public class SubClass extends Out.In{
	//显示定义SubClass的构造器
	public SubClass(Out out) {
		//通过传入的Out对象显示调用In的构造器
		out.super("hello");
	}
}
