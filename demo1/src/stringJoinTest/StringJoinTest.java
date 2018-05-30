package stringJoinTest;

public class StringJoinTest {
	public static void main(String[] args) {
		String s1 = "疯狂Java";
		String s2 = "疯狂" + "Java";
		String s4 = "Java";
		String s5 = "疯狂";
		System.out.println(s1 == s2);
		String s3 = s5 + s4;
		System.out.println(s1 == s3);
		final String str1 = "疯狂";
		final String str2 = "Java";
		String str3 = str1 + str2;
		System.out.println(s1 == str3);
	}
}
//s2的值是两个字符串直接进行连接运算，编译器在编译阶段就确定s2的值与s1的值的指向一致;
//s3由s4和s5进行连接运算，由于s1和s2都是普通变量，编译器不会执行“宏替换”,
//因此编译器无法确定s3的值，无法指向字符串；
//str1和sr=tr2是“宏替换”，str3可在编译器中确定str3的指向