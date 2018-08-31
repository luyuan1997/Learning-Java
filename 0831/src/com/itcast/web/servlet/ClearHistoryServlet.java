package com.itcast.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 清空浏览记录
 */
public class ClearHistoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建cookie
		Cookie c = new Cookie("ids","");
		c.setPath(request.getContextPath()+"/");
		//设置时间
		c.setMaxAge(0);
		//回写浏览器
		response.addCookie(c);
		//页面跳转
		response.sendRedirect(request.getContextPath()+"/product_list.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
