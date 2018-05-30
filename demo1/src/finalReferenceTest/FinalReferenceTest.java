package finalReferenceTest;

import java.util.Arrays;

class Person{
	private int age;
	public Person() {};
	public Person(int age) {
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
}
public class FinalReferenceTest {
	public static void main(String[] args) {
		//final修饰数组变量，iArr是一个引用变量
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		//对数组进行排序，合法
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//对数组元素赋值，合法
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//下面语句对iArr重新赋值，非法
		//iArr = null;
		//final修饰Person变量，p是一个引用变量
		final Person p = new Person(45);
		//改变Person对象的age实例变量，合法
		p.setAge(23);
		System.out.println(p.getAge());
		//下面语句对p重新赋值，非法
		// p = null;
	}
}
