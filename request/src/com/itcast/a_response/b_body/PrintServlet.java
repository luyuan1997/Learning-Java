package com.itcast.a_response.b_body;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作响应体
 */
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//获取字符流
		PrintWriter w = response.getWriter();
		w.print("<table border=\"1\"><tr>");
		w.print("<td>用户名：</td>");
		w.print("<td>tom</td></tr>");
		w.print("<tr><td>密码:</td>");
		w.print("<td>123</td><tr></table>");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
