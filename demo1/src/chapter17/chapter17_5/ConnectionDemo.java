package chapter17.chapter17_5;
import java.sql.*;



public class ConnectionDemo {
	public static void main(String[] args) throws SQLException{
		Driver driver = new com.mysql.jdbc.Driver();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "lu910208");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
