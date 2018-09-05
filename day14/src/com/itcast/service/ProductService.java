package com.itcast.service;

import java.sql.SQLException;
import java.util.List;

import com.itcast.dao.ProductDao;
import com.itcast.domain.PageBean;
import com.itcast.domain.Product;

public class ProductService {
	/**
	 * 查询所有商品
	 * @return list 
	 * @throws SQLException 
	 */
	public List<Product> findAll() throws SQLException {
		return new ProductDao().findAll();
	}
	/**
	 * 添加商品
	 * @param p
	 * @throws SQLException 
	 */
	public void addProduct(Product p) throws SQLException {
		new ProductDao().addProduct(p);
	}
	public Product getProductById(String pid) throws SQLException {
		
		return new ProductDao().getProductById(pid);
	}
	public void updateProduct(Product p) throws SQLException {
		new ProductDao().updateProductById(p);
	}
	public void deleteProductById(String pid) throws SQLException {
		new ProductDao().deleteProductById(pid);
	}
	/**
	 * 删除多个商品
	 * @param ids
	 * @throws SQLException 
	 */
	public void deleteCheckedProducts(String[] ids) throws SQLException {
		ProductDao pDao = new ProductDao();
		for(String pid:ids) {
			pDao.deleteProductById(pid);
		}
		
	}
	/**
	 * 多条件查询
	 * @param name 商品名称
	 * @param kw 关键词
	 * @return
	 * @throws SQLException 
	 */
	public List<Product> findProductByCondition(String name, String kw) throws SQLException {
		return new ProductDao().findProductByCondition(name,kw);
	}
	public PageBean<Product> showProductsByPage(int currentPage, int pageSize) throws SQLException {
		//查询当前页数据
		ProductDao dao = new ProductDao();
		List<Product> list = dao.findProductByPage(currentPage,pageSize);
		//查询总条数
		int totalCount = dao.getCount();
		return new PageBean<>(list, currentPage, pageSize, totalCount);
	}

}
