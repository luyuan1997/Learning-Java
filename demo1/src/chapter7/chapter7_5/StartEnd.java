package chapter7.chapter7_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个pattern对象，并用它建立一个Matcher对象
		String regStr = "Java is very easy";
		System.out.println("目标字符串是："+regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find()) {
			System.out.println(m.group()+"子串的起始位置："+m.start()+",其结束位置："+m.end());
		}
	}

}
