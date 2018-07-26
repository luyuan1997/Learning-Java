package cn.itcast.jdbc;

import java.sql.*;

public class Test {

	public static final String DBDRIVER = "com.mssql.jdbc.Driver";
	public static void main(String[] args) {
		try {
			Class.forName(DBDRIVER);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
