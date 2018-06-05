package chapter6_8;

public class LambdaTest {
	Runnable r = () -> {
		for(int i=0; i<100; i++) {
			System.out.println();
		}
	};
}
