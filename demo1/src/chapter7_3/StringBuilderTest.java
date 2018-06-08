package chapter7_3;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		//追加字符串,sb="java"
		sb.append("java");
		//插入,sb = "Hello java"
		sb.insert(0, "Hello");
		//替换,sb = "Hello, java"
		sb.replace(5, 6, ",");
		//删除，sb = "Hellojava"
		sb.delete(5, 6);
		System.out.println(sb);
		//反转
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//改变StringBuilder的长度，将只保留前面部分
		sb.setLength(5);
		System.out.println(sb);
	}

}
