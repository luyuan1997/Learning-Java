package chapter6_8;
@FunctionalInterface
interface Converter{
	Integer convert(String from);
}
//public class MethodRefer{
//	//下面代码使用Lambda表达式创建Converter对象
//	Converter converter1 = from -> Integer.valueOf(from);
//	Integer val = converter1.convert("99");
//	System.out.println(val);//输出整数99
//	//方法引用代替Lambda表达式，引用类方法
//	//函数式接口中被实现方法的全部参数传给该类方法作为参数
//	Converter converter1 = Integer::valueOf;
//
//}