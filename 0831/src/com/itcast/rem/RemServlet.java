package com.itcast.rem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 记录访问的事件
 */
public class RemServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		PrintWriter w = response.getWriter();
		//获取制定cookie
		Cookie c = getCookieByName("lastTime",request.getCookies());
		//判断是否为空
		if(c == null) {
			w.print("您是第一次登陆");
		}else {
			String value = c.getValue();
			long time = Long.parseLong(value);
			Date date = new Date(time);
			w.print("您上次访问的时间为"+date.toLocaleString());
		}
		//将当前访问事件记录
		//创建cookie,末尾加空格是为了转化为字符串
		c = new Cookie("lastTime", new Date().getTime()+"");
		//写回
		response.addCookie(c);
	}
	/**
	 * 通过名称在cookie素组获取指定的cookie
	 * @param name cookie名称
	 * @param cookies 数组 
	 * @return
	 */
	private Cookie getCookieByName(String name, Cookie[] cookies) {
		if(cookies!=null) {
			for(Cookie c:cookies) {
				if(name.equals(c.getName())) {
					return c;
				}
			}
		}
		return null; 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
