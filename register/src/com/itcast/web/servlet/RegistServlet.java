package com.itcast.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itcast.domain.User;
import com.itcast.service.UserService;

/**
 * 用户注册
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		//封装数据
		//使用beanutils封装对象
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			//调用UserService完成保存操作，int regist(User user)
			int i = new UserService().regist(user);
			//判断结果是否符合我们的预期，若int=预期值,表示插入成功，否则失败
			if(i==1) {
				request.setAttribute("msg", "添加成功");
				request.getRequestDispatcher("/msg").forward(request, response);
			}else {
				request.setAttribute("msg", "添加失败");
				request.getRequestDispatcher("/msg").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
