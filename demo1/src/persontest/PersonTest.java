//成员变量和局部变量
package persontest;
//创建一个类
class Person{
	//定义一个实例变量
	public String name;
	//定义一个类变量
	public static int eyeNum;
}
public class PersonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一次主动使用Person类，该类自动初始化，则eyeNum变量开始起作用，输出为0
		System.out.println("Person的eyeNum类变量值："+Person.eyeNum);
		//创建Person对象
		Person p = new Person();
		//通过Person对象的引用p来访问Person对象name实例变量
		//并通过实例访问eyeNum类变量
		System.out.println("p变量的name变量值是："+p.name+", p对象的eyeNum变量值是："+p.eyeNum);
		//直接为Name实例变量赋值
		p.name="孙悟空";
		//通过Person对象来访问name实例，依然访问Person的eyeNum类变量
		p.eyeNum = 2;
		//再次通过Person对象来访问name实例变量和eyNum类变量
		System.out.println("p变量的name变量值是："+p.name+", p对象的eyeNum变量值是："+p.eyeNum);
		Person p2=new Person();
		System.out.println("p2对象的eyeNum类变量的值："+p2.eyeNum);
	}

}
