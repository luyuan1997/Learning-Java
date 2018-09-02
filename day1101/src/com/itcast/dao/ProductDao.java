package com.itcast.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itcast.domain.Product;
import com.itcast.utils.DataSourceUtils;

public class ProductDao {

	public List<Product> findAll() throws SQLException {
		//创建queryRunner
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		//编写sql
		String sql ="select * from product";
		//执行sql
		return qr.query(sql, new BeanListHandler<>(Product.class));
	}

}
