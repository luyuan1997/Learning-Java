package chapter8.chapter8_8;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;



public class SynchronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//下面程序创建了4个线程安全的集合对象
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}

}
