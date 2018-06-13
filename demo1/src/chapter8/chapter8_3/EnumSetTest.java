package chapter8.chapter8_3;

import java.util.EnumSet;

enum Season{
	SPRING,SUMMER,FALL,WINTER
}

public class EnumSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet es1 = EnumSet.allOf(Season.class);//枚举
		System.out.println(es1);
		//创建一个空集合，指定其几何元素是Season类的枚举值
		EnumSet es2 = EnumSet.noneOf(Season.class);
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//新创建的EnumSet集合元素和es4具有相同的类型
		//es5集合元素+es4的几何元素为Season枚举类的全部枚举值
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}

}
