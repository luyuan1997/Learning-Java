package p20190124;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadLocalForDB implements Runnable {
	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<>();
	private final String DB_URL = null;
	public Connection initialValue() throws SQLException {
		return DriverManager.getConnection(DB_URL);
	}
	public static Connection getConnection() {
		return connectionHolder.get();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
