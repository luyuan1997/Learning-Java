package chapter8.chapter8_8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class UnmodifiableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个空的、不可改变的List对象
		List unmodifiableList = Collections.emptyList();
		//创建只有一个只有一个元素，且不可改变的Set对象
		Set unmodifiableSet = Collections.singleton("疯狂JAVA讲义");
		//创建一个Map对象
		Map scores = new HashMap();
		scores.put("语文", 80);
		scores.put("JAVA", 82);
		//返回普通的Map对象对应的不可变版本
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//下面任意一行代码都将引发UnsupportedOperationException异常,因为集合为不可变集合
		unmodifiableList.add("测试元素");
		unmodifiableSet.add("测试元素");
		unmodifiableMap.put("MATH",90);
	}

}
