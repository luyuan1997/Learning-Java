package cn.itcast.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();

	/**
	 * 获取数据源
	 */
	public static DataSource getDataSource() {
		return ds;
	}
	/**
	 * 获取连接
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
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
