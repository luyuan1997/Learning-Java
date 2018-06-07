package chapter7_2;

import java.util.Map;
import java.util.Properties;

public class SystemTest{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//获取系统所有的环境变量
		Map<String, String> env = System.getenv();
		for(String name : env.keySet()) {
			System.out.println(name+"--->"+env.get(name));
		}
		//获取制定环境变量的值
		System.out.println(System.getenv("JAVA_HOME"));
		//获取所有的系统属性
		Properties props = System.getProperties();
		//将所有的系统属性保存到props.txt文件中
//		props.store(new FileOutputStream("props.txt"), "System Properties");
		//输出特定的系统属性
//		System.out.println(System.getProperty("os.name"));
	}

}
