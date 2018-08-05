package consumer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Info i = new Info();
		Producer pro=new Producer(i);
		Consumer con = new Consumer(i);
		new Thread(pro).start();
		new Thread(con).start();
	}

}
