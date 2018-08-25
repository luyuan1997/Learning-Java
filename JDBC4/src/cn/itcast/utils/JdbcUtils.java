package cn.itcast.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JdbcUtils {

	static final String DRIVERCLASS;
	static final String URL;
	static final String USER;
	static final String PASSWORD;

	static {
		// 获取ResourceBundle ctrl+2 l
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		// 获取指定内容
		DRIVERCLASS = bundle.getString("driverClass");
		URL = bundle.getString("url");
		USER = bundle.getString("user");
		PASSWORD = bundle.getString("password");
	}

	static {
		// 注册驱动
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 连接数据库
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// 获取连接 ctrl+o 整理包
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	/**
	 * 释放资源
	 * 
	 * @param conn
	 *            链接
	 * @param st
	 *            语句执行这
	 * @param rs
	 *            结果集
	 */
	public static void closeResource(Connection conn, Statement st, ResultSet rs) {

		closeResultSet(rs);
		closeStatement(st);
		closeConn(conn);
	}

	/**
	 * 释放链接
	 * 
	 * @param conn
	 *            链接
	 */
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;// 利于java垃圾回收机制快速收走
		}
	}

	/**
	 * 释放语句执行者
	 * 
	 * @param st
	 *            语句执行者
	 */
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			st = null;// 利于java垃圾回收机制快速收走
		}
	}

	/**
	 * 释放结果集
	 * 
	 * @param rs
	 *            结果集
	 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;// 利于java垃圾回收机制快速收走
		}
	}
}
