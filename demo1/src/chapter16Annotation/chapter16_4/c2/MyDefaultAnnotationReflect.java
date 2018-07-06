package chapter16Annotation.chapter16_4.c2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyDefaultAnnotationReflect{
	public String key() default "LU";
	public String value() default "shenzhen";
}