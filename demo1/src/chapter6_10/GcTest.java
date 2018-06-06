package chapter6_10;

public class GcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			new GcTest();
		}
	}
	public void finalize() {
		System.out.println("系统正在清理GcTest对象的资源...");
	}

}
