package chapter16Annotation.chapter16_5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//此方法只能用在类上
//@Target({ElementType.TYPE, ElementType.METHOD})此方法用在类和方法上
@Retention(value = RetentionPolicy.RUNTIME)

public @interface MyTargetAnnotation{
	public String key() default "lu";
	public String value() default "shenzhen";
}
