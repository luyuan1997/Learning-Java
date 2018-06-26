package chapter10.chapter10_2;

public class FinallyFlow {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean a = test();
		System.out.println(a);
	}
	public static boolean test() {
		try {
			//因为finally块中包含了return语句
			//所以下面的return语句失去作用
			return true;
		}
		finally {
			return false;
		}
	}

}
