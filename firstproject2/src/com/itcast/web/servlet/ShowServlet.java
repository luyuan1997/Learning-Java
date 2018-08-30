package com.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 展示登录次数
 */
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		//获取全部管理者
		ServletContext context = this.getServletContext();
		//获取登录的次数
		Integer newCount = (Integer) context.getAttribute("count");
		//在页面上进行打印
		response.getWriter().print("登陆成功的总人数为:"+newCount);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
