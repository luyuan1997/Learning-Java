package com.itcast.getproduct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 记录商品浏览历史
 */
public class GetProductByIdServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		
		//获取指定的cookie ids
		
		//判断cookie是否为空
		
		//跳转到指定的商品页面上
		response.sendRedirect(request.getContextPath()+"/product_info"+id+".html");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
