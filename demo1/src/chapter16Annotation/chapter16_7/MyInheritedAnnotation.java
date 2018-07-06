package chapter16Annotation.chapter16_7;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Inherited
@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyInheritedAnnotation {
	public String name();
}
