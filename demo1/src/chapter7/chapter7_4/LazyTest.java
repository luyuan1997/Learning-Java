package chapter7.chapter7_4;

import java.util.Calendar;

public class LazyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2003, 7,31);
		//将月份改为9，但是9月31日不存在
		//如果立即修改，系统将会把cal自动调整为10月1日
		cal.set(Calendar.MONTH, 8);
		//下面将会输出10月1日
		System.out.println(cal.getTime());
//		设置DATE字段为5
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
	}

}
