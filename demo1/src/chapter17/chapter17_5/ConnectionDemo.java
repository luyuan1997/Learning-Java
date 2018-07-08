package chapter17.chapter17_5;

public class ConnectionDemo {
	public static final String DBDRIVER = "org.git.mm.mysql.Driver";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DBDRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
