package chapter16Annotation.chapter16_4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Reflect {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<?> c = null;
		c=Class.forName("chapter16Annotation.chapter16_4.SimpleBean");
		Method toM = c.getMethod("toString");
		Annotation an[] = toM.getAnnotations();
		for(Annotation a:an) {
			System.out.println(a);
		}
	}

}
