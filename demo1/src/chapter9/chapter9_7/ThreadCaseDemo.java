package chapter9.chapter9_7;

public class ThreadCaseDemo {
	public static void main(String[] args) {
		Info i = new Info();
		Producer pro = new Producer(i);
		Consumer con = new Consumer(i);
		new Thread(pro).start();
		new Thread(con).start();
	}
}
