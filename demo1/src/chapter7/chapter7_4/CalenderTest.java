package chapter7.chapter7_4;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		//取出年
		System.out.println(c.get(Calendar.YEAR));
		//取出月份
		System.out.println(c.get(Calendar.MONTH));
		//取出日期
		System.out.println(c.get(Calendar.DATE));
		//分别设置年、月、日、小时、分钟、秒
		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());
		//将Calendar的月前推8个月
		c.roll(Calendar.MONTH, -8);
		System.out.println(c.getTime());
	}

}
