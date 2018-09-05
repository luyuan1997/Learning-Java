package com.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.domain.PageBean;
import com.itcast.domain.Product;
import com.itcast.service.ProductService;

/**
 * 分页展示商品
 */
public class ShowProductsByPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置代码
		
		//获取第几页
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		//获取每页显示的条数
		int pageSize = 3;
		
		//调用service完成分页操作
		PageBean<Product> bean = null;
		try {
			bean = new ProductService().showProductsByPage(currentPage,pageSize);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//将pageBean放入request域中，请求转发
		request.setAttribute("pb", bean);
		request.getRequestDispatcher("/product_page.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
