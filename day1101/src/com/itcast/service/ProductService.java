package com.itcast.service;

import java.sql.SQLException;
import java.util.List;

import com.itcast.dao.ProductDao;
import com.itcast.domain.Product;

public class ProductService {

	public List<Product> findAll() throws SQLException {
		return new ProductDao().findAll();
		// TODO Auto-generated method stub
		
	}

}
