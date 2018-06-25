package chapter10.chapter10_2;

import java.util.Date;

public class NullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = null;
		try {
			System.out.println(d.after(new Date()));
		}
		catch(NullPointerException ne){
			System.out.println("空指针异常");
		}
		catch(Exception e){
			System.out.println("未知异常");
		}
	}

}
