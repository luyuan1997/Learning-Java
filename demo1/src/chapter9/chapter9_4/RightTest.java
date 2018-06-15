package chapter9.chapter9_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RightTest {

	static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for(T ele : from) {
			to.add(ele);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		test(as, ao);
	}

}
