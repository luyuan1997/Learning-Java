package com.itcast.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itcast.domain.Product;
import com.itcast.service.ProductService;

/**
 * 修改商品
 */
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		//封装数据
		Product p = new Product();
		try {
			BeanUtils.populate(p, request.getParameterMap());
			//调用service完成更新
			new ProductService().updateProduct(p);
			//重定向FindAllServlet
			response.sendRedirect(request.getContextPath()+"/FindAll");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "未能完成更新，出错了");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
