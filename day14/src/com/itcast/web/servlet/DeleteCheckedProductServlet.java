package com.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.service.ProductService;

/**
 * Servlet implementation class DeleteCheckedProductServlet
 */
public class DeleteCheckedProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取id
		String[] ids = request.getParameterValues("pid");
		//调用service完成删除
		try {
			new ProductService().deleteCheckedProducts(ids);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//重定向
		response.sendRedirect(request.getContextPath()+"/findAll");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
