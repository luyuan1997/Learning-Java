package chapter16Annotation.chapter16_4.c2;

public class SimpleBean {
	@SuppressWarnings("unchecked")
	@Deprecated
	@Override
	@MyDefaultAnnotationReflect(key = "lu", value = "shenzhen")
	public String toString() {
		return "Hello Lu";
	}
}
