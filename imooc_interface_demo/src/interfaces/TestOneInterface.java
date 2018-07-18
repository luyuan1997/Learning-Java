package interfaces;

import org.junit.*;
import org.junit.runner.RunWith;

//@RunWith(BlockJUnit4ClassRunner.class)

public class TestOneInterface extends UnitTestBase{
	public TestOneInterface() {
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testHello() {
		OneInterface oneInterface = super.getBean("oneInterface");
		System.out.println(oneInterface.hello("我输入的参数："));
	}


}
