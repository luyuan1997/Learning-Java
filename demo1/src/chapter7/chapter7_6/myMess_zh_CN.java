package chapter7.chapter7_6;

import java.util.ListResourceBundle;

public class myMess_zh_CN extends ListResourceBundle{
	private final Object myData[][]= {
			{"msg","你好！今天的日期是{1}"}
	};
	//重写getContents()方法
	public Object[][] getContents(){
		//该方法返回资源的key-value对
		return myData;
	}
}
