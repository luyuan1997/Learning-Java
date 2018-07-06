package chapter16Annotation.chapter16_7;

import java.lang.annotation.Annotation;

public class ReflectInheritedDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<?> c = null;
		c=Class.forName("chapter16Annotation.chapter16_7.Student");
		Annotation an[] = c.getAnnotations();
		for(Annotation a:an) {
			System.out.println(a);
		}
		if(c.isAnnotationPresent(MyInheritedAnnotation.class)) {
			MyInheritedAnnotation mda = null;
			mda = c.getAnnotation(MyInheritedAnnotation.class);
			String name = mda.name();
			System.out.println("name="+name);
		}
	}

}
