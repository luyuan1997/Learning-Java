package com.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.domain.Product;
import com.itcast.service.ProductService;

/**
 * 通过id获取商品
 */
public class GetProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码，因为传入的数据中米有汉字，因此无需转码
		//获取商品的Id
		String pid = request.getParameter("pid");
		//调用service通过id获取商品
		Product p=null;
		try {
			p = new ProductService().getProductById(pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//将product放入request域中，请求转发到edit.jsp
		request.setAttribute("bean", p);
		request.getRequestDispatcher("/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
