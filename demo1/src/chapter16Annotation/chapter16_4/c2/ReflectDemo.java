package chapter16Annotation.chapter16_4.c2;

import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<?> c = null;
		c = Class.forName("chapter16Annotation.chapter16_4.c2.SimpleBean");
		Method toM = c.getMethod("toString");
		if(toM.isAnnotationPresent(MyDefaultAnnotationReflect.class)) {
			MyDefaultAnnotationReflect mda = null;
			mda = toM.getAnnotation(MyDefaultAnnotationReflect.class);
			String key = mda.key();
			String value = mda.key();
			System.out.println("key="+key);
			System.out.println("value="+value);
		}
	}

}
