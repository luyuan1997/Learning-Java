package chapter7.chapter7_6;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Date;

public class HelloArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个Locate变量
		Locale currentLocale = null;
		//如果运行程序制定了两个参数
		if(args.length == 2) {
			//使用运行程序的两个参数构造Locale实例
			currentLocale = new Locale(args[0], args[1]);
		}
		else {
			//否则直接使用系统默认的Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		//根据Locale加载语言资源
		ResourceBundle bundle = ResourceBundle.getBundle("myMess", currentLocale);
		//取得已加载的语言资源文件中的msg对应消息
		String msg = bundle.getString("msg");
		//使用MessageFormat为带占位符的字符串传入参数
		System.out.println(MessageFormat.format(msg, "yeeku", new Date()));
	}

}
