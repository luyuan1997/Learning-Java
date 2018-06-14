package chapter8.chapter8_6;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PropertiesTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("username", "yeeku");
		props.setProperty("password", "123456789");
		//将Properties中的key-value值保存到a.ini文件中
		props.store(new FileOutputStream("a.ini"), "common line");
		Properties props2 = new Properties();
		props2.setProperty("gender", "male");
		props2.load(new FileInputStream("a.ini"));
		System.out.println(props2);
	}

}
