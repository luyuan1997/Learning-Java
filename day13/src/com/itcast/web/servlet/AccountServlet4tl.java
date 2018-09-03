package com.itcast.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.service.AccountService;
import com.itcast.service.AccountService4tl;

/**
 * 转账
 */
public class AccountServlet4tl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter w = response.getWriter();
		//获取三个参数
		String fromUser = request.getParameter("fromuser");
		String toUser = request.getParameter("touser");
		String money = request.getParameter("money");
		//调用service的account方法
		try {
			new AccountService4tl().account(fromUser,toUser,money);
		} catch (Exception e) {
			e.printStackTrace();
			w.print("转账失败");
			return;
		}
		//打印信息
		w.print("转账成功");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
