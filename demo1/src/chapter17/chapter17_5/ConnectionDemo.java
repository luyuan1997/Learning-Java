package chapter17.chapter17_5;
import java.sql.*;


public class ConnectionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jbdc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
