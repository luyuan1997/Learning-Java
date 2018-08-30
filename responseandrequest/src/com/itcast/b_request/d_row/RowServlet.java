package com.itcast.b_request.d_row;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作请求行
 */
public class RowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求方式
		String m = request.getMethod();
		System.out.println("方式："+m);
		//获取请求资源
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		//获取请求参数的字符串
		String s = request.getQueryString();
		//获取协议版本
		String p = request.getProtocol();
		//获取请求的IP
		String ip = request.getRemoteAddr();
		//获取项目名
		String path = request.getContextPath();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
