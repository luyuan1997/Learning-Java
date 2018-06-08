package chapter7.chapter7_5;

import java.util.regex.*;

public class FindGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用字符串模拟从网络上得到的网页源码
		String str = "我想求购一本书籍，尽快联系我，13500006666"+"交朋友13611125565"+"出售二手电脑15899903312";
		//创建一个Pattern对象，并用它建立一个Matcher对象
		//该正则表达式只抓取13X和15X段的手机号
		//实际要抓取的哪些电话号码，只要修改正则表达式就好
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		//将所有符合正则表达式的子串全部输出
		while(m.find()) {
			System.out.println(m.group());
		}
				
	}

}
