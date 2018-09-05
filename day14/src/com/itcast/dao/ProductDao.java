package com.itcast.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itcast.domain.Product;
import com.itcast.utils.DataSourceUtils;

public class ProductDao {

	public List<Product> findAll() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product"; 
		return qr.query(sql, new BeanListHandler<>(Product.class));
	}

	public void addProduct(Product p) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into product(pid,pname,market_price,shop_price,pdate,pdesc) values(?,?,?,?,?,?)";
		qr.update(sql, p.getPid(),p.getPname(),p.getMarket_price(),
				p.getShop_price(),p.getPdate(),p.getPdesc());
	}

	public Product getProductById(String pid) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product where pid=?";
		return qr.query(sql, new BeanHandler<>(Product.class), pid);
	}

	public void updateProductById(Product p) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update product set pname = ?,market_price = ?,shop_price = ?,pdesc = ? where pid = ?";
		qr.update(sql, p.getPname(),p.getMarket_price(),p.getShop_price(),
				p.getPdesc(),p.getPid());
	}

	public void deleteProductById(String pid) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "delete from product where pid = ?";
		qr.update(sql, pid);
	}
	/**
	 * 多条件查询
	 * @param name 商品名称
	 * @param kw 关键词
	 * @return list
	 * @throws SQLException 
	 */
	public List<Product> findProductByCondition(String name, String kw) throws SQLException {
 		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
 		String sql = "select * from product where 1=1";
 		
 		//因为传入的两个参数可能均为空，因此，存放给的集合采用ArrayList
 		ArrayList<String> params = new ArrayList<>();
 		
 		//判断参数是否为空
 		if(name != null && name.trim().length()>0) {
 			sql+=(" and pname like ? ");//pname like "%***%"
 			params.add("%"+name+"%");
 		}
 		if(kw!=null && kw.trim().length()>0) {
 			sql+=(" and kw like ? ");
 			params.add("%"+kw+"%");
 		}
 		 
		return qr.query(sql, new BeanListHandler<>(Product.class), params.toArray());
	}

	public List<Product> findProductByPage(int currentPage, int pageSize) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product limit ?,?";
		return qr.query(sql, new BeanListHandler<>(Product.class), (currentPage-1)*pageSize,pageSize);
	}

	public int getCount() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select count(*) from product";
		return ((Long)qr.query(sql, new ScalarHandler())).intValue();
	}

}
