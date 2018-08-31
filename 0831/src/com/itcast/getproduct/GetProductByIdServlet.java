package com.itcast.getproduct;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.utils.CookieUtils;

/**
 * 记录商品浏览历史
 */
public class GetProductByIdServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		//获取当前访问商品的id
		String id = request.getParameter("id");
		//获取指定的cookie ids
		Cookie c = CookieUtils.getCookieByName("ids", request.getCookies());
		//判断cookie是否为空
		String ids = "";
		if(c == null) {
			//将当前商品id放入
			ids = id;
		}else {
			//获取值
			ids = c.getValue();
			String[] arr = ids.split("-");
			//将数组转成集合，此LIST长度不可变
			List<String> asList = Arrays.asList(arr);
			//将asList放入一个新的List中
			LinkedList<String> list = new LinkedList<>(asList);
			if(list.contains(id)) {
				list.remove(id);
				list.addFirst(id);
			}else {
				if(list.size()>2) {
					list.removeLast();
					list.addFirst(id);
				}else {
					list.addFirst(id);
				}
			}
			ids = "";
			//将list转成字符串
			for(String s : list) {
				ids+=(s+"-");
			}
			ids=ids.substring(0, ids.length()-1);
		}
		//将ids写回
		c = new Cookie("ids",ids);
		//设置访问路径
		c.setPath(request.getContextPath()+"/");
		//设置存活时间
		c.setMaxAge(3600);
		//写回浏览器
		response.addCookie(c);
		//跳转到指定的商品页面上
		response.sendRedirect(request.getContextPath()+"/product_info"+id+".html");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
