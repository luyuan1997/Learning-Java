package chapter8.chapter8_3;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("疯狂java讲义");
		c.add("轻量级javaee企业应用实战");
		//下面的程序会出现问题，原因在于c集合里的元素不是全部都为枚举值
		enumSet = EnumSet.copyOf(c);
	}

}
