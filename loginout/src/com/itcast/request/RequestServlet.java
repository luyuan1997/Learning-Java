package com.itcast.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接受参数
		String value = req.getParameter("username");
		//回写数据
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("data:"+value);
		System.out.println(value);
	}
}
