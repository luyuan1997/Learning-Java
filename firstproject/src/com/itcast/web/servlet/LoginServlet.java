package com.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.domain.User;
import com.itcast.service.UserService;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.设置编码格式
		response.setContentType("text/html;charset=utf-8");
		// 2.接受用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 3.调用userService里的login(username,password)，返回值为User user
		User user = null;
		try {
			user = new UserService().login(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("网络异常，请稍后重试");
		}
		// 4.判断user是否为空
		if (user == null) {
			response.getWriter().print("用户名和密码不匹配");
			//增加自动跳转功能
			response.setHeader("refresh", "3;url=/firstproject/index.html");
		} else {
			response.getWriter().print(user.getUsername() + ":欢迎回来");
		}
	}
}
