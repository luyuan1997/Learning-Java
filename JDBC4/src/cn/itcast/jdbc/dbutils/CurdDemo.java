package cn.itcast.jdbc.dbutils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import cn.itcast.utils.DataSourceUtils;

public class CurdDemo {

	@Test
	public void insert() throws SQLException {
		//创建QueryRunner类
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		//编写sql语句
		String sql = "insert into category values(?,?)";
		//执行sql
		qr.update(sql, "c002", "家用电器");
	}
}
