package Lee;

public class OutputFieldTest {
	public static void main(String[] args) {
		//访问另一个包中的Output接口的MAX_CACHE_LINE
		System.out.println(Lee.Output.MAX_CACHE_LINE);
		//下面语句将引发“为final变量赋值”的编译异常
		//lee.Output.MAX_CACHE_LINE = 20;
		//使用接口来调用类方法
		System.out.println(Lee.Output.staticTest());
	}
}
