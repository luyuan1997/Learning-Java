package chapter17.chapter17_5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo2 {
	public static final String DBDRIVER = "org.git.mm.mysql.Driver";
	public static final String DBURL = "jbdc:mysql://localhost:3306/mldn";
	public static final String DBUSER = "root";
	public static final String DBPASS = "lu910208";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
				Class.forName(DBDRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		try {
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
