package com.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.service.ProductService;

/**
 * 通过id删除商品s
 */
public class DeleteProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取商品Id
		String pid = request.getParameter("pid");
		//调用service完成商品删除
		try {
			new ProductService().deleteProductById(pid);
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", "你没能把我删除掉哦，这是缘分");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
			return;
		}
		//重定向
		response.sendRedirect(request.getContextPath()+"/findAll");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
