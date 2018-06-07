package chapter7_2;

public class IdentifyHashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//下面程序中的s1和s2是两个不同的对象
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		//String重写了hashCode()方法
		//改为根据字符序列计算hashCode值
		//因为s1和s2的字符串序列一直，所以他们的hashCode()方法返回值一致
		System.out.println(s1.hashCode()+"----"+s2.hashCode());
		//s1和s2是不同的字符串对象，所以他们的identityHashCode值不同
		System.out.println(System.identityHashCode(s1)+"----"+System.identityHashCode(s2));
		String s3 = "Java";
		String s4 = "Java";
		//s3和s4是相同的字符串对象，所以他们的identityHashCode值相同
		System.out.println(System.identityHashCode(s3)+"----"+System.identityHashCode(s4));
	}

}
